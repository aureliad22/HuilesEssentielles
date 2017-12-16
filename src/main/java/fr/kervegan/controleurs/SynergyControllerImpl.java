/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.dao.SynergyDAO;
import fr.kervegan.modeles.Synergy;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public class SynergyControllerImpl implements SynergyController {

	private @Getter @Setter SynergyDAO sdao;
	
	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.SynergyController#add(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public String add(Synergy synergy) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.SynergyController#update(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public void update(Synergy synergy) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.SynergyController#delete(fr.kervegan.modeles.Synergy)
	 */
	@Override
	public void delete(Synergy synergy) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.SynergyController#findAll()
	 */
	@Override
	public List<Synergy> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controleurs.SynergyController#findById(java.lang.String)
	 */
	@Override
	public Synergy findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
