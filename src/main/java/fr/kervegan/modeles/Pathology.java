/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.modeles;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Entity
@Table(name="pathologies")
public @Data class Pathology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5474281071890377507L;
	
	@Id
	private int id;
	private String name;
	private Diagnostic diagnostic;
}
