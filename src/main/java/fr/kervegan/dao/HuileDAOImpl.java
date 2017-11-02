/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.kervegan.models.db.HuileDb;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class HuileDAOImpl implements HuileDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.HuileDAO#insert(fr.kervegan.models.db.HuileDb)
	 */
	public String insert(HuileDb huile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.HuileDAO#update(fr.kervegan.models.db.HuileDb)
	 */
	public void update(HuileDb huile) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.HuileDAO#delete(fr.kervegan.models.db.HuileDb)
	 */
	public void delete(HuileDb huile) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.HuileDAO#getAll()
	 */
	public List<HuileDb> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.HuileDAO#getById(java.lang.String)
	 */
	public HuileDb getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
