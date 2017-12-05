/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.DiagnosticDAOImpl;
import fr.kervegan.modeles.Diagnostic;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public class DiagnosticControllerImpl implements DiagnosticController {

	private @Getter @Setter DiagnosticDAOImpl ddao;
	
	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.DiagnosticController#add(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public String add(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.DiagnosticController#update(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public void update(Diagnostic diagnostic) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.DiagnosticController#delete(fr.kervegan.modeles.Diagnostic)
	 */
	@Override
	public void delete(Diagnostic diagnostic) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.DiagnosticController#findAll()
	 */
	@Override
	public List<Diagnostic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.DiagnosticController#findById(java.lang.String)
	 */
	@Override
	public Diagnostic findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
