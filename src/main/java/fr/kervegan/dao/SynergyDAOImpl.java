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

import fr.kervegan.modeles.Synergy;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class SynergyDAOImpl implements SynergyDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.SynergyDAO#insert(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public Boolean insert(Synergy synergy) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.SynergyDAO#update(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public Boolean update(Synergy synergy) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.SynergyDAO#delete(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public Boolean delete(Synergy synergy) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.SynergyDAO#getAll()
	 */
	@Override
	public List<Synergy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.SynergyDAO#getById(java.lang.String)
	 */
	@Override
	public Synergy getById(String id) {
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
