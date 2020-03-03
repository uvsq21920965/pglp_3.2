
public class VendeurTest {
	
	Vendeur v1=new Vendeur(200);
	Vendeur v2=new Vendeur(120);
	Vendeur v3=new Vendeur(0);
	
	
@Test
public void salaireTest() {
	
	double salaireV1=v1.salaire(0);
	double salaireV2=v2.salaire(2);
	double salaireV1=v3.salaire(10);
	
	assertEquals(salaireV1,1700);
	assertEquals(salaireV2,1700);
	assertEquals(salaireV3,1510);
}

}
