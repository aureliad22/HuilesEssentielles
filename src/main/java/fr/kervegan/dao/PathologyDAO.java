/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.modeles.Pathology;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface PathologyDAO {

	public Boolean insert(Pathology pathology);
	public Boolean update (Pathology pathology);
	public Boolean delete(Pathology pathology);
	public List<Pathology> getAll();
	public Pathology getById(String id);
}
