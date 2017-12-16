/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.modeles;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Entity
@Table(name="synergies")
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"name", "description"})
@ToString
public class Synergy {

	@Id
	private int id;
	private String name;
	private String description;
}
