import static org.junit.Assert.assertEquals;
import org.junit.Test;
import fr.uvsq21920965.pglp32.Vendeur;

public class VendeurTest {

	/**
	 * creer des instancesde vendeur.
	 */
	Vendeur v1=new Vendeur(0,200);
	Vendeur v2=new Vendeur(2,120);
	Vendeur v3=new Vendeur(10,0);
	
     /**
      *verifier si le salaire calcule egale au salaire attendue.
      */
	@Test
	public void salaireTest() {
		
		double salaireV1=v1.calculeSalaire();
		double salaireV2=v2.calculeSalaire();
		double salaireV3=v3.calculeSalaire();
		
		assertEquals(salaireV1,1700.0,0);
		assertEquals(salaireV2,1660.0,0);
		assertEquals(salaireV3,1700.0,0);
	}


}