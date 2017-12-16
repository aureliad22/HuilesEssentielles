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

	public Boolean insert(Synergy synergy);
	public Boolean update (Synergy synergy);
	public Boolean delete(Synergy synergy);
	public List<Synergy> getAll();
	public Synergy getById(String id);
}
