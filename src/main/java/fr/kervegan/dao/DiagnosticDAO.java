/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.dao;

import java.util.List;

import fr.kervegan.modeles.Diagnostic;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
public interface DiagnosticDAO {

	public Boolean insert(Diagnostic diagnostic);
	public Boolean update (Diagnostic diagnostic);
	public Boolean delete(Diagnostic diagnostic);
	public List<Diagnostic> getAll();
	public Diagnostic getById(String id);
}
