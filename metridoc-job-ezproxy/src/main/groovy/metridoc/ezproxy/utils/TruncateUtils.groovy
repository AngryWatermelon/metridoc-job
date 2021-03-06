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
/**
 * @author Tommy Barker
 */
class TruncateUtils {
    public static final DEFAULT_VARCHAR_LENGTH = 255
    public static final DEFAULT_EZPROXY_ID_LENGTH = 50

    @SuppressWarnings("GrMethodMayBeStatic")
    static void truncateProperties(Map body, String... propertyNames) {
        propertyNames.each { propertyName ->
            def propertyValue = body[propertyName]
            if(propertyName == "ezproxyId") {
                body[propertyName] = truncate(propertyValue, DEFAULT_EZPROXY_ID_LENGTH)
            }
            else if (propertyValue && propertyValue instanceof String) {
                body[propertyName] = truncate(propertyValue, DEFAULT_VARCHAR_LENGTH)
            }
        }
    }

    static String truncate(String value, int length) {
        if (value) {
            if(value.size() > length) {
                return value.substring(0, length)
            }
        }

        return value
    }
}
