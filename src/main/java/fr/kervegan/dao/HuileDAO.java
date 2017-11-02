/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.models.db.HuileDb;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public interface HuileDAO {

	public String insert(HuileDb huile);
	public void update (HuileDb huile);
	public void delete(HuileDb huile);
	public List<HuileDb> getAll();
	public HuileDb getById(String id);
}
