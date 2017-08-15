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
 * 动态数据接口
 * @author <a href="http://surenpi.com">suren</a>
 */
public interface DynamicData
{
	/**
	 * 格式化给定的字符串
	 * @param orginData 原始数据，例如：变量、脚本、模板等
	 * @return 格式化后的字符串
	 */
	String getValue(String orginData);
	
	/**
	 * @return 动态数据类型（用于区分标识）
	 */
	String getType();
	
	/**
	 * 设置动态参数
	 * @param data 动态参数
	 */
	void setData(Map<String, Object> data);
}
