package com.lin.ssm.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.ssm.crm.mapper.Base_dictMapper;
import com.lin.ssm.crm.pojo.Base_dict;
import com.lin.ssm.crm.pojo.Customer;

/*
*@author linoneplus
*/
@Service
public class Base_dictServiceImpl implements Base_dictService {

	@Autowired
	private Base_dictMapper basedictmapper;
	@Override
	public List<Base_dict> queryBaseDictByDictTypeCode(String code) {
		return basedictmapper.queryBaseDictByDictTypeCode(code);
	}

}
