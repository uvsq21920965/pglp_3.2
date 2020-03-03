import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21920965.pglp32.Manager;

public class ManagerTest {
	/**
	 * creer des instancesde vendeur.
	 */
	Manager m1=new Manager(0,5);
	Manager m2=new Manager(2,10);
	Manager m3=new Manager(10,3);
	
     /**
      *verifier si le salaire calcule egale au salaire attendue.
      */
	@Test
	public void salaireTest() {
		
		double salaireM1=m1.calculeSalaire();
		double salaireM2=m2.calculeSalaire();
		double salaireM3=m3.calculeSalaire();
		
		assertEquals(salaireM1,2000.0,0);
		assertEquals(salaireM2,2540.0,0);
		assertEquals(salaireM3,2000.0,0);
	}

}
