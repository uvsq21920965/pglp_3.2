import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendeurTest {
	
	Vendeur v1=new Vendeur(200);
	Vendeur v2=new Vendeur(120);
	Vendeur v3=new Vendeur(0);
	

	@Test
	public void salaireTest() {
		
		double salaireV1=v1.calcule_salaire(0);
		double salaireV2=v2.calcule_salaire(2);
		double salaireV3=v3.calcule_salaire(10);
		
		assertEquals(salaireV1,1700.0,0);
		assertEquals(salaireV2,1660.0,0);
		assertEquals(salaireV3,1700.0,0);
	}
}
