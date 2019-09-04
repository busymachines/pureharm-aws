/**
  * Copyright (c) 2017-2019 BusyMachines
  *
  * See company homepage at: https://www.busymachines.com/
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package busymachines.pureharm.aws.core

import busymachines.pureharm.anomaly._
/**
  *
  * @author Lorand Szakacs, https://github.com/lorandszakacs
  * @since 10 Jul 2019
  *
  */
final case class InvalidAmazonS3RegionIA(r: String) extends InvalidInputAnomaly(s"Invalid AmazonS3 region: $r") {
  override val id: AnomalyID = InvalidAmazonS3RegionID
}
case object InvalidAmazonS3RegionID extends AnomalyID { override val name: String = "PH_AWS_S3_001" }