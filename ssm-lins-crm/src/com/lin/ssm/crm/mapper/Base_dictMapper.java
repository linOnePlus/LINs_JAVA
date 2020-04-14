package com.lin.ssm.crm.mapper;
/*
 * 数据字典持久化接口
*@author linoneplus
*/

import java.util.List;

import com.lin.ssm.crm.pojo.Base_dict;

public interface Base_dictMapper {

	/**
	 * 根据dict_type_code初始化查询条件
	 */
	List<Base_dict> queryBaseDictByDictTypeCode(String code);
	
	
}
