/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.EssentialOilDAOImpl;
import fr.kervegan.modeles.EssentialOil;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public class HuileControllerImpl implements HuileController {
	
	private @Getter @Setter EssentialOilDAOImpl eodao;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.HuileController#add(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public String add(EssentialOil huile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.HuileController#update(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public void update(EssentialOil huile) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.HuileController#delete(fr.kervegan.modeles.EssentialOil)
	 */
	@Override
	public void delete(EssentialOil huile) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.HuileController#findAll()
	 */
	@Override
	public List<EssentialOil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.HuileController#findById(java.lang.String)
	 */
	@Override
	public EssentialOil findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
