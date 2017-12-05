/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import java.util.List;

import fr.kervegan.modeles.Pathology;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface PathologyController {

	public String add(Pathology pathology);
	public void update(Pathology pathology);
	public void delete(Pathology pathology);
	public List<Pathology> findAll();
	public Pathology findById(String id);	
}
