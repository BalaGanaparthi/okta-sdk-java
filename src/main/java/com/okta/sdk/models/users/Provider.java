/*!
 * Copyright (c) 2015-2017, Okta, Inc. and/or its affiliates. All rights reserved.
 * The Okta software accompanied by this notice is provided pursuant to the Apache License, Version 2.0 (the "License.")
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.okta.sdk.models.users;

import com.okta.sdk.framework.ApiObject;

public class Provider extends ApiObject {

    /**
     * Provider type.
     */
    private String type;

    /**
     * Provider name.
     */
    private String name;

    /**
     * Returns the type.
     * @return {@link String}
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the type.
     * @param val {@link String}
     */
    public void setType(String val) {
        this.type = val;
    }

    /**
     * Returns the name.
     * @return {@link String}
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     * @param val {@link String}
     */
    public void setName(String val) {
        this.name = val;
    }
}
