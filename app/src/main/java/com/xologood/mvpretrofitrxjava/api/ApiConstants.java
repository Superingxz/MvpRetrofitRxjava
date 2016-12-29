/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
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
 *
 */
package com.xologood.mvpretrofitrxjava.api;


import com.xologood.mvpretrofitrxjava.Config;

public class ApiConstants {


    public static final String ACCOUNT_PADLOGINON = "/Account/PDALoginOn?"+ Config.mustPassParameter;
    public static final String BEAN = "/api/GetFeeds?column=7&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";

    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.USERURL:
                host = Config.userUrl;
                break;
            case HostType.SYSTEMURL:
                host = Config.systemUrl;
                break;
            case HostType.BEANHOST:
                host = "http://litchiapi.jstv.com";
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}
