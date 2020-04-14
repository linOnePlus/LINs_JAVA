package com.lin.dao;

import java.util.List;

import com.lin.crm.domain.BaseDict;

/**
 * 字典DAO的接口
 * @author jt
 *
 */
public interface BaseDictDao extends BaseDao<BaseDict>{

	List<BaseDict> findByTypeCode(String dict_type_code);

}
