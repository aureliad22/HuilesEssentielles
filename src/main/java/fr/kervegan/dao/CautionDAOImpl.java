/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.kervegan.modeles.Caution;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class CautionDAOImpl implements CautionDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.CautionDAO#insert(fr.kervegan.modeles.Caution)
	 */
	@Override
	public Boolean insert(Caution caution) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.CautionDAO#update(fr.kervegan.modeles.Caution)
	 */
	@Override
	public Boolean update(Caution caution) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.CautionDAO#delete(fr.kervegan.modeles.Caution)
	 */
	@Override
	public Boolean delete(Caution caution) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.CautionDAO#getAll()
	 */
	@Override
	public List<Caution> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.CautionDAO#getById(java.lang.String)
	 */
	@Override
	public Caution getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Getter pour entityManager.
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Setter pour entityManager.
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
