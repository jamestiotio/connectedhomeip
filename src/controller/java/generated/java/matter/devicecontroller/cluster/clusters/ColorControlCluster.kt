/*
 *
 *    Copyright (c) 2023 Project CHIP Authors
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

package matter.devicecontroller.cluster.clusters

import java.util.ArrayList

class ColorControlCluster(private val endpointId: UShort) {
  class NumberOfPrimariesAttribute(val value: UByte?)

  class Primary1IntensityAttribute(val value: UByte?)

  class Primary2IntensityAttribute(val value: UByte?)

  class Primary3IntensityAttribute(val value: UByte?)

  class Primary4IntensityAttribute(val value: UByte?)

  class Primary5IntensityAttribute(val value: UByte?)

  class Primary6IntensityAttribute(val value: UByte?)

  class ColorPointRIntensityAttribute(val value: UByte?)

  class ColorPointGIntensityAttribute(val value: UByte?)

  class ColorPointBIntensityAttribute(val value: UByte?)

  class StartUpColorTemperatureMiredsAttribute(val value: UShort?)

  class GeneratedCommandListAttribute(val value: ArrayList<UInt>)

  class AcceptedCommandListAttribute(val value: ArrayList<UInt>)

  class EventListAttribute(val value: ArrayList<UInt>)

  class AttributeListAttribute(val value: ArrayList<UInt>)

  suspend fun moveToHue(
    hue: UByte,
    direction: UInt,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToHue(
    hue: UByte,
    direction: UInt,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveHue(moveMode: UInt, rate: UByte, optionsMask: UInt, optionsOverride: UInt) {
    // Implementation needs to be added here
  }

  suspend fun moveHue(
    moveMode: UInt,
    rate: UByte,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepHue(
    stepMode: UInt,
    stepSize: UByte,
    transitionTime: UByte,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepHue(
    stepMode: UInt,
    stepSize: UByte,
    transitionTime: UByte,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToSaturation(
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToSaturation(
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveSaturation(
    moveMode: UInt,
    rate: UByte,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveSaturation(
    moveMode: UInt,
    rate: UByte,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepSaturation(
    stepMode: UInt,
    stepSize: UByte,
    transitionTime: UByte,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepSaturation(
    stepMode: UInt,
    stepSize: UByte,
    transitionTime: UByte,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToHueAndSaturation(
    hue: UByte,
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToHueAndSaturation(
    hue: UByte,
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToColor(
    colorX: UShort,
    colorY: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToColor(
    colorX: UShort,
    colorY: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveColor(rateX: Short, rateY: Short, optionsMask: UInt, optionsOverride: UInt) {
    // Implementation needs to be added here
  }

  suspend fun moveColor(
    rateX: Short,
    rateY: Short,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepColor(
    stepX: Short,
    stepY: Short,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepColor(
    stepX: Short,
    stepY: Short,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToColorTemperature(
    colorTemperatureMireds: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveToColorTemperature(
    colorTemperatureMireds: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveToHue(
    enhancedHue: UShort,
    direction: UInt,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveToHue(
    enhancedHue: UShort,
    direction: UInt,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveHue(
    moveMode: UInt,
    rate: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveHue(
    moveMode: UInt,
    rate: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedStepHue(
    stepMode: UInt,
    stepSize: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedStepHue(
    stepMode: UInt,
    stepSize: UShort,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveToHueAndSaturation(
    enhancedHue: UShort,
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun enhancedMoveToHueAndSaturation(
    enhancedHue: UShort,
    saturation: UByte,
    transitionTime: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun colorLoopSet(
    updateFlags: UInt,
    action: UInt,
    direction: UInt,
    time: UShort,
    startHue: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun colorLoopSet(
    updateFlags: UInt,
    action: UInt,
    direction: UInt,
    time: UShort,
    startHue: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun stopMoveStep(optionsMask: UInt, optionsOverride: UInt) {
    // Implementation needs to be added here
  }

  suspend fun stopMoveStep(optionsMask: UInt, optionsOverride: UInt, timedInvokeTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun moveColorTemperature(
    moveMode: UInt,
    rate: UShort,
    colorTemperatureMinimumMireds: UShort,
    colorTemperatureMaximumMireds: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun moveColorTemperature(
    moveMode: UInt,
    rate: UShort,
    colorTemperatureMinimumMireds: UShort,
    colorTemperatureMaximumMireds: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepColorTemperature(
    stepMode: UInt,
    stepSize: UShort,
    transitionTime: UShort,
    colorTemperatureMinimumMireds: UShort,
    colorTemperatureMaximumMireds: UShort,
    optionsMask: UInt,
    optionsOverride: UInt
  ) {
    // Implementation needs to be added here
  }

  suspend fun stepColorTemperature(
    stepMode: UInt,
    stepSize: UShort,
    transitionTime: UShort,
    colorTemperatureMinimumMireds: UShort,
    colorTemperatureMaximumMireds: UShort,
    optionsMask: UInt,
    optionsOverride: UInt,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun readCurrentHueAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeCurrentHueAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readCurrentSaturationAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeCurrentSaturationAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readRemainingTimeAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeRemainingTimeAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readCurrentXAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeCurrentXAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readCurrentYAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeCurrentYAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readDriftCompensationAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeDriftCompensationAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readCompensationTextAttribute(): CharString {
    // Implementation needs to be added here
  }

  suspend fun subscribeCompensationTextAttribute(minInterval: Int, maxInterval: Int): CharString {
    // Implementation needs to be added here
  }

  suspend fun readColorTemperatureMiredsAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorTemperatureMiredsAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorModeAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorModeAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readOptionsAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeOptionsAttribute(value: UInt) {
    // Implementation needs to be added here
  }

  suspend fun writeOptionsAttribute(value: UInt, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeOptionsAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readNumberOfPrimariesAttribute(): NumberOfPrimariesAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeNumberOfPrimariesAttribute(
    minInterval: Int,
    maxInterval: Int
  ): NumberOfPrimariesAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary1XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary1XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary1YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary1YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary1IntensityAttribute(): Primary1IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary1IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary1IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary2XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary2XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary2YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary2YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary2IntensityAttribute(): Primary2IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary2IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary2IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary3XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary3XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary3YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary3YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary3IntensityAttribute(): Primary3IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary3IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary3IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary4XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary4XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary4YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary4YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary4IntensityAttribute(): Primary4IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary4IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary4IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary5XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary5XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary5YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary5YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary5IntensityAttribute(): Primary5IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary5IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary5IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readPrimary6XAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary6XAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary6YAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary6YAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readPrimary6IntensityAttribute(): Primary6IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribePrimary6IntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Primary6IntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readWhitePointXAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeWhitePointXAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeWhitePointXAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeWhitePointXAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readWhitePointYAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeWhitePointYAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeWhitePointYAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeWhitePointYAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointRXAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRXAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRXAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointRXAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointRYAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRYAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRYAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointRYAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointRIntensityAttribute(): ColorPointRIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRIntensityAttribute(value: UByte) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointRIntensityAttribute(value: UByte, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointRIntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): ColorPointRIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readColorPointGXAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGXAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGXAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointGXAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointGYAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGYAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGYAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointGYAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointGIntensityAttribute(): ColorPointGIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGIntensityAttribute(value: UByte) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointGIntensityAttribute(value: UByte, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointGIntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): ColorPointGIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readColorPointBXAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBXAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBXAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointBXAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointBYAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBYAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBYAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointBYAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorPointBIntensityAttribute(): ColorPointBIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBIntensityAttribute(value: UByte) {
    // Implementation needs to be added here
  }

  suspend fun writeColorPointBIntensityAttribute(value: UByte, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorPointBIntensityAttribute(
    minInterval: Int,
    maxInterval: Int
  ): ColorPointBIntensityAttribute {
    // Implementation needs to be added here
  }

  suspend fun readEnhancedCurrentHueAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeEnhancedCurrentHueAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readEnhancedColorModeAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeEnhancedColorModeAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorLoopActiveAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorLoopActiveAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorLoopDirectionAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorLoopDirectionAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorLoopTimeAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorLoopTimeAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorLoopStartEnhancedHueAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorLoopStartEnhancedHueAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorLoopStoredEnhancedHueAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorLoopStoredEnhancedHueAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorCapabilitiesAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorCapabilitiesAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorTempPhysicalMinMiredsAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorTempPhysicalMinMiredsAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readColorTempPhysicalMaxMiredsAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeColorTempPhysicalMaxMiredsAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readCoupleColorTempToLevelMinMiredsAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeCoupleColorTempToLevelMinMiredsAttribute(
    minInterval: Int,
    maxInterval: Int
  ): Integer {
    // Implementation needs to be added here
  }

  suspend fun readStartUpColorTemperatureMiredsAttribute(): StartUpColorTemperatureMiredsAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeStartUpColorTemperatureMiredsAttribute(value: UShort) {
    // Implementation needs to be added here
  }

  suspend fun writeStartUpColorTemperatureMiredsAttribute(value: UShort, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeStartUpColorTemperatureMiredsAttribute(
    minInterval: Int,
    maxInterval: Int
  ): StartUpColorTemperatureMiredsAttribute {
    // Implementation needs to be added here
  }

  suspend fun readGeneratedCommandListAttribute(): GeneratedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeGeneratedCommandListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): GeneratedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readAcceptedCommandListAttribute(): AcceptedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeAcceptedCommandListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): AcceptedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readEventListAttribute(): EventListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeEventListAttribute(minInterval: Int, maxInterval: Int): EventListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readAttributeListAttribute(): AttributeListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeAttributeListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): AttributeListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readFeatureMapAttribute(): Long {
    // Implementation needs to be added here
  }

  suspend fun subscribeFeatureMapAttribute(minInterval: Int, maxInterval: Int): Long {
    // Implementation needs to be added here
  }

  suspend fun readClusterRevisionAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeClusterRevisionAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  companion object {
    const val CLUSTER_ID: UInt = 768u
  }
}