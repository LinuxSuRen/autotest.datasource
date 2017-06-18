/*
 *
 *  * Copyright 2002-2007 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

/**
 * http://surenpi.com
 */
package com.surenpi.autotest.datasource;

import java.io.IOException;
import java.net.URL;

/**
 * 数据资源定义顶层接口
 * @author suren
 * @date Jul 17, 2016 8:47:30 AM
 */
public interface DataResource
{
	/**
	 * @return 资源所在的地址
	 * @throws IOException
	 */
	URL getUrl() throws IOException;
}
