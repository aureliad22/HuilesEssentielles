package fr.kervegan.dao;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.kervegan.modeles.EssentialOil;

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */

/**
 * @author oreade
 * @date 2 nov. 2017
 * @version HuilesEssentielles V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class EssentialOilDAOTest {

	private static EntityManager em;
	private static EssentialOilDAOImpl hdao;
	
	/**
	 * Méthode en charge de 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		hdao = new EssentialOilDAOImpl();
		hdao.setEntityManager(em);
	}

	/**
	 * Méthode en charge de 
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Méthode en charge de 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		EssentialOil huile = new EssentialOil();
		huile.setId(4);
	}

	/**
	 * Méthode en charge de 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link fr.kervegan.dao.EssentialOilDAOImpl#insert(fr.kervegan.models.db.HuileDb)}.
	 */
	@Test
	public void testInsert() {
		hdao.insert(new EssentialOil());
		
		assertEquals(4, hdao.getAll().size());	
	}

	/**
	 * Test method for {@link fr.kervegan.dao.EssentialOilDAOImpl#update(fr.kervegan.models.db.HuileDb)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.dao.EssentialOilDAOImpl#delete(fr.kervegan.models.db.HuileDb)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.dao.EssentialOilDAOImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.kervegan.dao.EssentialOilDAOImpl#getById(java.lang.String)}.
	 */
	@Test
	public void testGetById() {
		fail("Not yet implemented");
	}

}
