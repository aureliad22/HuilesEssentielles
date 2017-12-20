/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.modeles.EssentialOil;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public interface EssentialOilController {

	public Boolean add(EssentialOil huile);
	public Boolean update(EssentialOil huile);
	public Boolean delete(EssentialOil huile);
	public List<EssentialOil> findAll();
	public EssentialOil findById(String id);
}
