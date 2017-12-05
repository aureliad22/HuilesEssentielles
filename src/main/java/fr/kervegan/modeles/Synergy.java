/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.modeles;

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
@Table(name="synergies")
public @Data class Synergy {

	@Id
	private int id;
	private String name;
	private String description;
}
