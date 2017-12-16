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

import fr.kervegan.modeles.EssentialOil;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class EssentialOilDAOImpl implements EssentialOilDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.EssentialOilDAO#insert(fr.kervegan.models.db.HuileDb)
	 */
	public Boolean insert(EssentialOil huile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.EssentialOilDAO#update(fr.kervegan.models.db.HuileDb)
	 */
	public Boolean update(EssentialOil huile) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.EssentialOilDAO#delete(fr.kervegan.models.db.HuileDb)
	 */
	public Boolean delete(EssentialOil huile) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.EssentialOilDAO#getAll()
	 */
	public List<EssentialOil> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.EssentialOilDAO#getById(java.lang.String)
	 */
	public EssentialOil getById(String id) {
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
