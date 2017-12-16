/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.CautionDAO;
import fr.kervegan.modeles.Caution;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public class CautionControllerImpl implements CautionController {

	private @Getter @Setter CautionDAO cdao;
	
	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.CautionController#add(fr.kervegan.modeles.Caution)
	 */
	@Override
	public String add(Caution caution) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.CautionController#update(fr.kervegan.modeles.Caution)
	 */
	@Override
	public void update(Caution caution) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.CautionController#delete(fr.kervegan.modeles.Caution)
	 */
	@Override
	public void delete(Caution caution) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.CautionController#findAll()
	 */
	@Override
	public List<Caution> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.CautionController#findById(java.lang.String)
	 */
	@Override
	public Caution findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
