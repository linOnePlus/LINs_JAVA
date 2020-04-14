package com.lin.crm.service.impl;

import java.util.List;

import com.lin.crm.domain.BaseDict;
import com.lin.crm.service.BaseDictService;
import com.lin.dao.BaseDictDao;
/**
 * 字典的业务层的实现类
 * @author jt
 *
 */
public class BaseDictServiceImpl implements BaseDictService {
	// 注入DAO
	private BaseDictDao baseDictDao;

	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return baseDictDao.findByTypeCode(dict_type_code);
	}
	
}
