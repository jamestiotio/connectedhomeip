/**
 *
 *    Copyright (c) 2021 Project CHIP Authors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

#include "MediaPlaybackManager.h"
#include <app-common/zap-generated/attributes/Accessors.h>
#include <app/util/config.h>

using namespace std;
using namespace chip::app::DataModel;
using namespace chip::app::Clusters::MediaPlayback;
using namespace chip::Uint8;
using chip::CharSpan;

PlaybackStateEnum MediaPlaybackManager::HandleGetCurrentState()
{
    return mCurrentState;
}

uint64_t MediaPlaybackManager::HandleGetStartTime()
{
    return mStartTime;
}

uint64_t MediaPlaybackManager::HandleGetDuration()
{
    return mDuration;
}

CHIP_ERROR MediaPlaybackManager::HandleGetSampledPosition(AttributeValueEncoder & aEncoder)
{
    return aEncoder.Encode(mPlaybackPosition);
}

float MediaPlaybackManager::HandleGetPlaybackSpeed()
{
    return mPlaybackSpeed;
}

uint64_t MediaPlaybackManager::HandleGetSeekRangeStart()
{
    return mStartTime;
}

uint64_t MediaPlaybackManager::HandleGetSeekRangeEnd()
{
    return mDuration;
}

CHIP_ERROR MediaPlaybackManager::HandleGetActiveAudioTrack(AttributeValueEncoder & aEncoder)
{
    return aEncoder.Encode(mActiveAudioTrack);
}

CHIP_ERROR MediaPlaybackManager::HandleGetAvailableAudioTracks(AttributeValueEncoder & aEncoder)
{
    // TODO: Insert code here
    return aEncoder.EncodeList([this](const auto & encoder) -> CHIP_ERROR {
        for (auto const & audioTrack : mAvailableAudioTracks)
        {
            ReturnErrorOnFailure(encoder.Encode(audioTrack));
        }
        return CHIP_NO_ERROR;
    });
}

CHIP_ERROR MediaPlaybackManager::HandleGetActiveTextTrack(AttributeValueEncoder & aEncoder)
{
    return aEncoder.Encode(mActiveTextTrack);
}

CHIP_ERROR MediaPlaybackManager::HandleGetAvailableTextTracks(AttributeValueEncoder & aEncoder)
{
    // TODO: Insert code here
    return aEncoder.EncodeList([this](const auto & encoder) -> CHIP_ERROR {
        for (auto const & textTrack : mAvailableTextTracks)
        {
            ReturnErrorOnFailure(encoder.Encode(textTrack));
        }
        return CHIP_NO_ERROR;
    });
}

void MediaPlaybackManager::HandlePlay(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mCurrentState  = PlaybackStateEnum::kPlaying;
    mPlaybackSpeed = 1;

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandlePause(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mCurrentState  = PlaybackStateEnum::kPaused;
    mPlaybackSpeed = 0;

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleStop(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mCurrentState     = PlaybackStateEnum::kNotPlaying;
    mPlaybackSpeed    = 0;
    mPlaybackPosition = { 0, chip::app::DataModel::Nullable<uint64_t>(0) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleFastForward(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper,
                                             const chip::Optional<bool> & audioAdvanceUnmuted)
{
    // TODO: Insert code here
    if (mPlaybackSpeed == kPlaybackMaxForwardSpeed)
    {
        // if already at max speed, return error
        Commands::PlaybackResponse::Type response;
        response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
        response.status = StatusEnum::kSpeedOutOfRange;
        helper.Success(response);
        return;
    }

    mCurrentState  = PlaybackStateEnum::kPlaying;
    mPlaybackSpeed = (mPlaybackSpeed <= 0 ? 1 : mPlaybackSpeed * 2);
    if (mPlaybackSpeed > kPlaybackMaxForwardSpeed)
    {
        // don't exceed max speed
        mPlaybackSpeed = kPlaybackMaxForwardSpeed;
    }

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandlePrevious(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mCurrentState     = PlaybackStateEnum::kPlaying;
    mPlaybackSpeed    = 1;
    mPlaybackPosition = { 0, chip::app::DataModel::Nullable<uint64_t>(0) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleRewind(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper,
                                        const chip::Optional<bool> & audioAdvanceUnmuted)
{
    // TODO: Insert code here
    if (mPlaybackSpeed == kPlaybackMaxRewindSpeed)
    {
        // if already at max speed in reverse, return error
        Commands::PlaybackResponse::Type response;
        response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
        response.status = StatusEnum::kSpeedOutOfRange;
        helper.Success(response);
        return;
    }

    mCurrentState  = PlaybackStateEnum::kPlaying;
    mPlaybackSpeed = (mPlaybackSpeed >= 0 ? -1 : mPlaybackSpeed * 2);
    if (mPlaybackSpeed < kPlaybackMaxRewindSpeed)
    {
        // don't exceed max rewind speed
        mPlaybackSpeed = kPlaybackMaxRewindSpeed;
    }

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleSkipBackward(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper,
                                              const uint64_t & deltaPositionMilliseconds)
{
    // TODO: Insert code here
    uint64_t newPosition = (mPlaybackPosition.position.Value() > deltaPositionMilliseconds
                                ? mPlaybackPosition.position.Value() - deltaPositionMilliseconds
                                : 0);
    mPlaybackPosition    = { 0, chip::app::DataModel::Nullable<uint64_t>(newPosition) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleSkipForward(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper,
                                             const uint64_t & deltaPositionMilliseconds)
{
    // TODO: Insert code here
    uint64_t newPosition = mPlaybackPosition.position.Value() + deltaPositionMilliseconds;
    newPosition          = newPosition > mDuration ? mDuration : newPosition;
    mPlaybackPosition    = { 0, chip::app::DataModel::Nullable<uint64_t>(newPosition) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleSeek(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper,
                                      const uint64_t & positionMilliseconds)
{
    // TODO: Insert code here
    if (positionMilliseconds > mDuration)
    {
        Commands::PlaybackResponse::Type response;
        response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
        response.status = StatusEnum::kSeekOutOfRange;
        helper.Success(response);
    }
    else
    {
        mPlaybackPosition = { 0, chip::app::DataModel::Nullable<uint64_t>(positionMilliseconds) };

        Commands::PlaybackResponse::Type response;
        response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
        response.status = StatusEnum::kSuccess;
        helper.Success(response);
    }
}

void MediaPlaybackManager::HandleNext(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mCurrentState     = PlaybackStateEnum::kPlaying;
    mPlaybackSpeed    = 1;
    mPlaybackPosition = { 0, chip::app::DataModel::Nullable<uint64_t>(0) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

void MediaPlaybackManager::HandleStartOver(CommandResponseHelper<Commands::PlaybackResponse::Type> & helper)
{
    // TODO: Insert code here
    mPlaybackPosition = { 0, chip::app::DataModel::Nullable<uint64_t>(0) };

    Commands::PlaybackResponse::Type response;
    response.data   = chip::MakeOptional(CharSpan::fromCharString("data response"));
    response.status = StatusEnum::kSuccess;
    helper.Success(response);
}

bool MediaPlaybackManager::HandleActivateAudioTrack(const chip::CharSpan & trackId, const uint8_t & audioOutputIndex)
{
    bool foundMatch = false;
    for (auto const & availableAudioTrack : mAvailableAudioTracks)
    {
        if (strcmp(availableAudioTrack.id.data(), trackId.data()) == 0)
        {
            mActiveAudioTrack = availableAudioTrack;
            foundMatch        = true;
        }
    }

    if (!foundMatch)
    {
        // return an error
    }

    return true;
}

bool MediaPlaybackManager::HandleActivateTextTrack(const chip::CharSpan & trackId)
{
    bool foundMatch = false;
    for (auto const & availableTextTrack : mAvailableTextTracks)
    {
        if (strcmp(availableTextTrack.id.data(), trackId.data()) == 0)
        {
            mActiveAudioTrack = availableTextTrack;
            foundMatch        = true;
        }
    }

    if (!foundMatch)
    {
        // return an error
    }

    return true;
}

bool MediaPlaybackManager::HandleDeactivateTextTrack()
{
    // Handle Deactivate Text Track
    if (mActiveTextTrack.id.data() != nullptr)
    {
        mActiveTextTrack = {};
    }
    return true;
}

uint32_t MediaPlaybackManager::GetFeatureMap(chip::EndpointId endpoint)
{
    if (endpoint >= EMBER_AF_CONTENT_LAUNCHER_CLUSTER_SERVER_ENDPOINT_COUNT)
    {
        return mDynamicEndpointFeatureMap;
    }

    uint32_t featureMap = 0;
    Attributes::FeatureMap::Get(endpoint, &featureMap);
    return featureMap;
}
