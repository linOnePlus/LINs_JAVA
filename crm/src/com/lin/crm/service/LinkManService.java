package com.lin.crm.service;

import org.hibernate.criterion.DetachedCriteria;

import com.lin.crm.domain.LinkMan;
import com.lin.crm.domain.PageBean;

/**
 * 联系人的Service的接口
 * @author jt
 *
 */
public interface LinkManService {

	PageBean<LinkMan> findAll(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);

	void save(LinkMan linkMan);

	LinkMan findById(Long lkm_id);

	void update(LinkMan linkMan);

	void delete(LinkMan linkMan);

}
