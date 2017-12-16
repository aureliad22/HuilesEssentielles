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

import fr.kervegan.modeles.Diagnostic;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Transactional(transactionManager="transactionManager")
public class DiagnosticDAOImpl implements DiagnosticDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.DiagnosticDAO#insert(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public Boolean insert(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.DiagnosticDAO#update(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public Boolean update(Diagnostic diagnostic) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.DiagnosticDAO#delete(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public Boolean delete(Diagnostic diagnostic) {
		return null;
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.DiagnosticDAO#getAll()
	 */
	@Override
	public List<Diagnostic> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.dao.DiagnosticDAO#getById(java.lang.String)
	 */
	@Override
	public Diagnostic getById(String id) {
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
