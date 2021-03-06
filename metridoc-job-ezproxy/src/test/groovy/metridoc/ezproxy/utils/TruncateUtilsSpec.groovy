/*
  *Copyright 2013 Trustees of the University of Pennsylvania. Licensed under the
  *	Educational Community License, Version 2.0 (the "License"); you may
  *	not use this file except in compliance with the License. You may
  *	obtain a copy of the License at
  *
  *http://www.osedu.org/licenses/ECL-2.0
  *
  *	Unless required by applicable law or agreed to in writing,
  *	software distributed under the License is distributed on an "AS IS"
  *	BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
  *	or implied. See the License for the specific language governing
  *	permissions and limitations under the License.
  */

package metridoc.ezproxy.utils

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA on 10/15/13
 * @author Tommy Barker
 */
class TruncateUtilsSpec extends Specification {

    void "if the value is null, then the value is returned"() {
        when:
        def result = TruncateUtils.truncate(null, 5)

        then:
        noExceptionThrown()
        null == result
    }
}
