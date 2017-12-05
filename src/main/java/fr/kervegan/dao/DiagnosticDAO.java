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

	public String insert(Diagnostic diagnostic);
	public void update (Diagnostic diagnostic);
	public void delete(Diagnostic diagnostic);
	public List<Diagnostic> getAll();
	public Diagnostic getById(String id);
}
