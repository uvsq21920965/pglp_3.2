import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeTest{
	/**
	 * creer des instances d'employe.
	 */
	Employe e1=new Employe(0);
	Employe e2=new Employe(2);
	Employe e3=new Employe(10);

    /**
     * verifier si le salaire calcule egale au salaire attendue.
     */
	@Test
	public void salaireTest() {
		
		double salaireE1=e1.calculeSalaire();
		double salaireE2=e2.calculeSalaire();
		double salaireE3=e3.calculeSalaire();

		assertEquals(salaireE1,1500.0,0);
		assertEquals(salaireE2,1540.0,0);
		assertEquals(salaireE3,1700.0,0);
	}
}
