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

import lombok.*;

/**
 * @author oreade
 * @date 4 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@Entity
@Table(name="precautions")
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"label"})
@ToString
public class Caution implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8550767345437138728L;
	
	@Id
	private int id;
	private String label;
}
