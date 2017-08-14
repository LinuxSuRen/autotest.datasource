/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.surenpi.autotest.datasource;

/**
 * 动态数据类型常量
 * @author <a href="http://surenpi.com">suren</a>
 */
public interface DynamicDataConstants
{
	/** 简单类型的数据{@value} */
	String DDC_SIMPLE = "simple";
    /** 数据将被会当作freemarker模板来解析 */
    String DDC_FREEMARKER = "freemarker";
    String DDC_PROPERTIES = "properties";
    String DDC_SYSTEM = "system";
    String DDC_RANDOM_TEXT = "random_text";
    String DDC_PAGE_REF = "page_ref";
    /** 数据将会被当作Groovy脚本来解析 */
    String DDC_GROOVY = "groovy";
    /** 数据将会被当作JavaScript脚本来解析 */
    String DDC_JAVASCRIPT = "javascript";
    String DDC_ENCRYPT = "encrypt";
    String DDC_CALLBACK = "callback";
    String DDC_SEQUENCE = "sequence";
}
