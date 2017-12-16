/**
 * @author oreade
 * @date 1 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.modeles;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.kervegan.modeles.Caution;
import lombok.*;

/**
 * @author oreade
 * @date 1 nov. 2017
 * @version HuilesEssentielles V1.0
 */
@Entity
@Table(name="Huiles")
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"number", "commonName", "latinGenderName","latinSpeciesName","note"})
@ToString(exclude = {"listCautions","listDiagnostics"})
public class EssentialOil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6499981663177464161L;
	
	@Id
	private int id;
	private int number;
	private String commonName;
	private String latinGenderName;
	private String latinSpeciesName;
	private String note;
	private List<Caution> listCautions;
	private List<Diagnostic> listDiagnostics;
}
