/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controllers;

import java.util.List;

import fr.kervegan.models.Huile;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public interface HuileController {

	public String ajouterHuile(Huile huile);
	public void modifierHuile(Huile huile);
	public void supprimerHuile(Huile huile);
	public List<Huile> selectionnerHuiles();
	public Huile selectionnerParId(String id);
}
