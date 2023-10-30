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

class GroupKeyManagementCluster(private val endpointId: UShort) {
  class KeySetReadResponse(val groupKeySet: ChipStructs.GroupKeyManagementClusterGroupKeySetStruct)

  class KeySetReadAllIndicesResponse(val groupKeySetIDs: ArrayList<UShort>)

  class GroupKeyMapAttribute(
    val value: ArrayList<ChipStructs.GroupKeyManagementClusterGroupKeyMapStruct>
  )

  class GroupTableAttribute(
    val value: ArrayList<ChipStructs.GroupKeyManagementClusterGroupInfoMapStruct>
  )

  class GeneratedCommandListAttribute(val value: ArrayList<UInt>)

  class AcceptedCommandListAttribute(val value: ArrayList<UInt>)

  class EventListAttribute(val value: ArrayList<UInt>)

  class AttributeListAttribute(val value: ArrayList<UInt>)

  suspend fun keySetWrite(groupKeySet: ChipStructs.GroupKeyManagementClusterGroupKeySetStruct) {
    // Implementation needs to be added here
  }

  suspend fun keySetWrite(
    groupKeySet: ChipStructs.GroupKeyManagementClusterGroupKeySetStruct,
    timedInvokeTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun keySetRead(groupKeySetID: UShort): KeySetReadResponse {
    // Implementation needs to be added here
  }

  suspend fun keySetRead(groupKeySetID: UShort, timedInvokeTimeoutMs: Int): KeySetReadResponse {
    // Implementation needs to be added here
  }

  suspend fun keySetRemove(groupKeySetID: UShort) {
    // Implementation needs to be added here
  }

  suspend fun keySetRemove(groupKeySetID: UShort, timedInvokeTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun keySetReadAllIndices(): KeySetReadAllIndicesResponse {
    // Implementation needs to be added here
  }

  suspend fun keySetReadAllIndices(timedInvokeTimeoutMs: Int): KeySetReadAllIndicesResponse {
    // Implementation needs to be added here
  }

  suspend fun readGroupKeyMapAttribute(): GroupKeyMapAttribute {
    // Implementation needs to be added here
  }

  suspend fun readGroupKeyMapAttributeWithFabricFilter(
    isFabricFiltered: Boolean
  ): GroupKeyMapAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeGroupKeyMapAttribute(
    value: ArrayList<ChipStructs.GroupKeyManagementClusterGroupKeyMapStruct>
  ) {
    // Implementation needs to be added here
  }

  suspend fun writeGroupKeyMapAttribute(
    value: ArrayList<ChipStructs.GroupKeyManagementClusterGroupKeyMapStruct>,
    timedWriteTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun subscribeGroupKeyMapAttribute(
    minInterval: Int,
    maxInterval: Int
  ): GroupKeyMapAttribute {
    // Implementation needs to be added here
  }

  suspend fun readGroupTableAttribute(): GroupTableAttribute {
    // Implementation needs to be added here
  }

  suspend fun readGroupTableAttributeWithFabricFilter(
    isFabricFiltered: Boolean
  ): GroupTableAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeGroupTableAttribute(
    minInterval: Int,
    maxInterval: Int
  ): GroupTableAttribute {
    // Implementation needs to be added here
  }

  suspend fun readMaxGroupsPerFabricAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeMaxGroupsPerFabricAttribute(minInterval: Int, maxInterval: Int): Integer {
    // Implementation needs to be added here
  }

  suspend fun readMaxGroupKeysPerFabricAttribute(): Integer {
    // Implementation needs to be added here
  }

  suspend fun subscribeMaxGroupKeysPerFabricAttribute(minInterval: Int, maxInterval: Int): Integer {
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
    const val CLUSTER_ID: UInt = 63u
  }
}