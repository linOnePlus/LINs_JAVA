package com.lin.ssm.crm.service;
/*
 * 数据字典业务逻辑接口
*@author linoneplus
*/

import java.util.List;

import com.lin.ssm.crm.pojo.Base_dict;
import com.lin.ssm.crm.pojo.Customer;

public interface Base_dictService {

	/**
	 * 根据dict_type_code初始化查询条件
	 */
	List<Base_dict> queryBaseDictByDictTypeCode(String code);
	

}
