/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controllers;

import java.util.List;

import fr.kervegan.dao.HuileDAOImpl;
import fr.kervegan.models.Huile;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
public class HuileControllerImpl implements HuileController {
	private HuileDAOImpl hdao;

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controllers.HuileController#ajouterHuile(fr.kervegan.models.Huile)
	 */
	public String ajouterHuile(Huile huile) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controllers.HuileController#modifierHuile(fr.kervegan.models.Huile)
	 */
	public void modifierHuile(Huile huile) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controllers.HuileController#supprimerHuile(fr.kervegan.models.Huile)
	 */
	public void supprimerHuile(Huile huile) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controllers.HuileController#selectionnerHuiles()
	 */
	public List<Huile> selectionnerHuiles() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see fr.kervegan.controllers.HuileController#selectionnerParId(java.lang.String)
	 */
	public Huile selectionnerParId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Getter pour hdao.
	 * @return the hdao
	 */
	public HuileDAOImpl getHdao() {
		return hdao;
	}

	/**
	 * Setter pour hdao.
	 * @param hdao the hdao to set
	 */
	public void setHdao(HuileDAOImpl hdao) {
		this.hdao = hdao;
	}

}
