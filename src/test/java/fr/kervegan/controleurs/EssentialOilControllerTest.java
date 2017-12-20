/**
 * @author oreade
 * @date 5 déc. 2017
 * @version HuilesEssentielles V1.0
 */
package fr.kervegan.controleurs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

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
		oil.setCommonName("test");
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
		verify(oildao, times(2)).insert(any(EssentialOil.class));
		assertThat(oilctrl.add(oil)).isTrue();
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
		verify(oildao, times(2)).update(any(EssentialOil.class));
		assertThat(oilctrl.update(oil)).isTrue();	
	}
	
	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#delete(fr.kervegan.modeles.EssentialOil)}.
	 */
	@Test
	public void testDelete() {
		when(oildao.delete(any(EssentialOil.class))).thenReturn(true);
		assertThat(oildao.delete(oil), is(true));

		oilctrl.delete(oil);
		verify(oildao, times(2)).delete(any(EssentialOil.class));
		assertThat(oilctrl.delete(oil), is(true));
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#findAll()}.
	 */
	@Test
	public void testFindAll() {
		List<EssentialOil> expected = new ArrayList<>();
		expected.add(oil);
		when(oildao.getAll()).thenReturn(expected);

		List<EssentialOil> result = oilctrl.findAll();
		verify(oildao, times(1)).getAll();
		assertEquals(expected, result);
		assertEquals("test", result.get(0).getCommonName());
	}

	/**
	 * Test method for
	 * {@link fr.kervegan.controleurs.EssentialOilController#findById(java.lang.String)}.
	 */
	@Test
	public void testFindById() {
		when(oildao.getById(1)).thenReturn(oil);

		EssentialOil result = oilctrl.findById(1);
		assertEquals(oil, result);
	}
}
