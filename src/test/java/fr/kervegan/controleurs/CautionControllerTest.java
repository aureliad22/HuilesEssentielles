/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fr.kervegan.dao.CautionDAO;
import fr.kervegan.modeles.Caution;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@RunWith(MockitoJUnitRunner.class)
public class CautionControllerTest {

	@InjectMocks
	private static CautionControllerImpl cctrl;
	@Mock
	private static CautionDAO cdao;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cctrl = new CautionControllerImpl();
		cdao = mock(CautionDAO.class);
		cctrl.setCdao(cdao);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reset(cdao);
	}

	/**
	 * Test method for {@link fr.kervegan.controleurs.CautionController#add(fr.kervegan.modeles.Caution)}.
	 */
	@Test
	public void testAdd() {
		when(cdao.insert(any(Caution.class))).thenReturn(true);
	}

	/**
	 * Test method for {@link fr.kervegan.controleurs.CautionController#update(fr.kervegan.modeles.Caution)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.controleurs.CautionController#delete(fr.kervegan.modeles.Caution)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.controleurs.CautionController#findAll()}.
	 */
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.controleurs.CautionController#findById(java.lang.String)}.
	 */
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
