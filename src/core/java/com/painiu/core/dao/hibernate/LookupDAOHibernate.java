package com.painiu.core.dao.hibernate;

import java.util.List;

import com.painiu.core.dao.LookupDAO;


/**
 * Hibernate implementation of LookupDAO.
 *
 * <p><a href="LookupDAOHibernate.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class LookupDAOHibernate extends BaseDAOHibernate implements LookupDAO {

    /**
     * @see com.painiu.core.dao.LookupDAO#getRoles()
     */
	public List getRoles() {
        if (log.isDebugEnabled()) {
            log.debug("retrieving all role names...");
        }

        return getHibernateTemplate().find("from Role order by name");
    }
}
