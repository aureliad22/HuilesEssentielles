/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fr.kervegan.dao.EssentialOilDAO;
import fr.kervegan.modeles.EssentialOil;

/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
@RunWith(MockitoJUnitRunner.class)
public class EssentialOilControllerTest {

	@InjectMocks
	private static EssentialOilControllerImpl oilctrl;
	@Mock
	private static EssentialOilDAO oildao;

	private EssentialOil oil;

	/**
	 * Méthode en charge de
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		oilctrl = new EssentialOilControllerImpl();
		oildao = mock(EssentialOilDAO.class);
		oilctrl.setEodao(oildao);
	}

	/**
	 * Méthode en charge de
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		oil = new EssentialOil();
		oil.setId(1);
		reset(oildao);
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#add(fr.kervegan.modeles.EssentialOil)}.
	 */
	@Test
	public void testAdd() {
		when(oildao.insert(any(EssentialOil.class))).thenReturn(true);
		assertThat(oildao.insert(oil), is(true));

		oilctrl.add(oil);
		verify(oildao, times(1)).insert(any(EssentialOil.class));
		//assertThat(oilctrl.add(oil)).isTrue();
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#update(fr.kervegan.modeles.EssentialOil)}.
	 */
	@Test
	public void testUpdate() {
		when(oildao.update(any(EssentialOil.class))).thenReturn(true);
		assertThat(oildao.update(oil), is(true));

		oilctrl.update(oil);
		verify(oildao, times(1)).update(any(EssentialOil.class));
		//assertThat(oilctrl.add(oil)).isTrue();	}
	}
	
	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#delete(fr.kervegan.modeles.EssentialOil)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#findAll()}.
	 */
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#findById(java.lang.String)}.
	 */
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
