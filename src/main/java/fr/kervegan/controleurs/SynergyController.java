/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.modeles.Synergy;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface SynergyController {

	public String add(Synergy synergy);
	public void update(Synergy synergy);
	public void delete(Synergy synergy);
	public List<Synergy> findAll();
	public Synergy findById(String id);
}
