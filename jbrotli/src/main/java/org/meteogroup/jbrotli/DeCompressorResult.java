/*
 * Copyright (c) 2016 MeteoGroup Deutschland GmbH
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.meteogroup.jbrotli;

public class DeCompressorResult {
  public final int bytesConsumed;
  public final int bytesProduced;

  public DeCompressorResult(int bytesConsumed, int bytesProduced) {
    this.bytesConsumed = bytesConsumed;
    this.bytesProduced = bytesProduced;
  }

  public DeCompressorResult(NativeDeCompressorResult nativeResult) {
    this.bytesConsumed = nativeResult.bytesConsumed;
    this.bytesProduced = nativeResult.bytesProduced;
  }
}
