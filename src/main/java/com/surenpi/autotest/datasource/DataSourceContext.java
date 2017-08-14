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

package com.surenpi.autotest.datasource;

import java.util.Map;

/**
 * @author suren
 * @author <a href="http://surenpi.com">suren</a>
 */
public class DataSourceContext
{
	private Map<String, DataSource<?>>	dataSourceMap;

	/**
	 * @return the dataSourceMap
	 */
	public Map<String, DataSource<?>> getDataSourceMap()
	{
		return dataSourceMap;
	}

	/**
	 * @param dataSourceMap the dataSourceMap to set
	 */
	public void setDataSourceMap(Map<String, DataSource<?>> dataSourceMap)
	{
		this.dataSourceMap = dataSourceMap;
	}
}
