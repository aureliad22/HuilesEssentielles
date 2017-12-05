/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.modeles.Caution;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface CautionDAO {

	public String insert(Caution caution);
	public void update (Caution caution);
	public void delete(Caution caution);
	public List<Caution> getAll();
	public Caution getById(String id);
}
