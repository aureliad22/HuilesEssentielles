/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.EssentialOilDAO;
import fr.kervegan.modeles.EssentialOil;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public class EssentialOilControllerImpl implements EssentialOilController {
	
	private @Getter @Setter EssentialOilDAO eodao;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.EssentialOilController#add(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public Boolean add(EssentialOil huile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.EssentialOilController#update(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public Boolean update(EssentialOil huile) {
		return null;
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.EssentialOilController#delete(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public Boolean delete(EssentialOil huile) {
		return null;
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.EssentialOilController#findAll()
	 */
	@Override
	public List<EssentialOil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.EssentialOilController#findById(java.lang.String)
	 */
	@Override
	public EssentialOil findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
