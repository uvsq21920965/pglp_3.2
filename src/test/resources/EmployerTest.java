
public class EmployerTest {
	
	Empoloyer e1=new Employer();
	Empoloyer e2=new Employer();
	Empoloyer e3=new Employer();
	
	

@Test
public void salaireTest() {
	
	double salaireE1=e1.salaire(0);
	double salaireE2=e2.salaire(2);
	double salaireE1=e3.salaire(10);
	
	assertEquals(salaireE1,1500);
	assertEquals(salaireE2,1540);
	assertEquals(salaireE3,1510);
}

}
