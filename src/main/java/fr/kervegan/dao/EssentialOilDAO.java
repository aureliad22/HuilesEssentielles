/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.modeles.EssentialOil;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public interface EssentialOilDAO {

	public Boolean insert(EssentialOil oil);
	public Boolean update (EssentialOil oil);
	public Boolean delete(EssentialOil oil);
	public List<EssentialOil> getAll();
	public EssentialOil getById(int id);
}
