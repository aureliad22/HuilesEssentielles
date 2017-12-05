/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.modeles.Synergy;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface SynergyDAO {

	public String insert(Synergy synergy);
	public void update (Synergy synergy);
	public void delete(Synergy synergy);
	public List<Synergy> getAll();
	public Synergy getById(String id);
}
