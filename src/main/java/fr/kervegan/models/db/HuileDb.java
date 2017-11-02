/**
 * @author oreade
 * @date 1 nov. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.models.db;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author oreade
 * @date 1 nov. 2017
 * @version HuilesEssentielles V1.0
 */
@Entity
@Table(name="huiles_essentielles")
public class HuileDb implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6499981663177464161L;
	
	@Id
	private String id;
	private int numero;
	private String nom_commun;
	private String nom_latin_genre;
	private String nom_latin_espece;
	private String note;
/*	private List<Precaution> precautions;
	private List<Molecule> moleculesActives;
	private List<Pathologie> pathologies;*/
	
	/**
	 * Constructeur.
	 */
	public HuileDb() {
		super();
	}

	/**
	 * Getter pour id.
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter pour id.
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Getter pour numero.
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter pour numero.
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour nom_commun.
	 * @return the nom_commun
	 */
	public String getNom_commun() {
		return nom_commun;
	}

	/**
	 * Setter pour nom_commun.
	 * @param nom_commun the nom_commun to set
	 */
	public void setNom_commun(String nom_commun) {
		this.nom_commun = nom_commun;
	}

	/**
	 * Getter pour nom_latin_genre.
	 * @return the nom_latin_genre
	 */
	public String getNom_latin_genre() {
		return nom_latin_genre;
	}

	/**
	 * Setter pour nom_latin_genre.
	 * @param nom_latin_genre the nom_latin_genre to set
	 */
	public void setNom_latin_genre(String nom_latin_genre) {
		this.nom_latin_genre = nom_latin_genre;
	}

	/**
	 * Getter pour nom_latin_espece.
	 * @return the nom_latin_espece
	 */
	public String getNom_latin_espece() {
		return nom_latin_espece;
	}

	/**
	 * Setter pour nom_latin_espece.
	 * @param nom_latin_espece the nom_latin_espece to set
	 */
	public void setNom_latin_espece(String nom_latin_espece) {
		this.nom_latin_espece = nom_latin_espece;
	}

	/**
	 * Getter pour note.
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Setter pour note.
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HuileDb [id=").append(id).append(", numero=").append(numero).append(", nom_commun=")
				.append(nom_commun).append("]");
		return builder.toString();
	}
}
