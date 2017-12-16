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

import fr.kervegan.modeles.Pathology;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class PathologyDAOImpl implements PathologyDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.PathologyDAO#insert(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public Boolean insert(Pathology pathology) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.PathologyDAO#update(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public Boolean update(Pathology pathology) {
		return null;
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.PathologyDAO#delete(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public Boolean delete(Pathology pathology) {
		return null;
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.PathologyDAO#getAll()
	 */
	@Override
	public List<Pathology> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.PathologyDAO#getById(java.lang.String)
	 */
	@Override
	public Pathology getById(String id) {
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
