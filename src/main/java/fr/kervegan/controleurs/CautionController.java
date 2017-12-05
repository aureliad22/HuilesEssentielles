/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.modeles.Caution;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface CautionController {

	public String add(Caution caution);
	public void update(Caution caution);
	public void delete(Caution caution);
	public List<Caution> findAll();
	public Caution findById(String id);
}
