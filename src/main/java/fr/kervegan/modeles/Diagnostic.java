/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.modeles;

import java.io.Serializable;
import java.util.List;

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
@Table(name="diagnostics")
public @Data class Diagnostic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7234711255350714362L;
	
	@Id
	private int id;
	private String description;
	private List<Pathology> listPathologies;
}
