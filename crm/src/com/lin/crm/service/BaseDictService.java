package com.lin.crm.service;

import java.util.List;

import com.lin.crm.domain.BaseDict;

/**
 * 字典的业务层的接口
 * @author jt
 *
 */
public interface BaseDictService {

	List<BaseDict> findByTypeCode(String dict_type_code);

}
