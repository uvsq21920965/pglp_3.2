import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployerTest {
	
	Empoloyer e1=new Employer();
	Empoloyer e2=new Employer();
	Empoloyer e3=new Employer();
	
	

	@Test
	public void salaireTest() {
		
		double salaireE1=e1.calcule_salaire(0);
		double salaireE2=e2.calcule_salaire(2);
		double salaireE3=e3.calcule_salaire(10);
		System.out.println(salaireE1);
		System.out.println(salaireE2);
		System.out.println(salaireE3);
		
		assertEquals(salaireE1,1500.0,0);
		assertEquals(salaireE2,1540.0,0);
		assertEquals(salaireE3,1700.0,0);
	}

}
