/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.PathologyDAO;
import fr.kervegan.modeles.Pathology;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public class PathologyControllerImpl implements PathologyController {

	private @Getter @Setter PathologyDAO pdao;
	
	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.PathologyController#add(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public String add(Pathology pathology) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.PathologyController#update(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public void update(Pathology pathology) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.PathologyController#delete(fr.kervegan.modeles.Pathology)
	 */
	@Override
	public void delete(Pathology pathology) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.PathologyController#findAll()
	 */
	@Override
	public List<Pathology> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.PathologyController#findById(java.lang.String)
	 */
	@Override
	public Pathology findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
