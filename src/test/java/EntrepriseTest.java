
import static org.junit.Assert.*;
import org.junit.Test;
import fr.uvsq21920965.pglp32.Employe;
import fr.uvsq21920965.pglp32.Vendeur;
import fr.uvsq21920965.pglp32.Entreprise;

public class EntrepriseTest {

    /**
     * creer des instances d'employes et de vendeurs.
     */
	Employe emp1 =  new Employe(5);
	Employe emp2 =  new Vendeur(3,500);
	Employe emp3 =  new Vendeur(1,50);
	Employe emp4 =  new Employe(0);
	Vendeur ven1  =  new Vendeur(4,100);
	Vendeur ven2  =  new Vendeur(2,70);
	
	/**
	 * creer des instances d'entreprise.
	 */
	Entreprise entr1=new Entreprise();
	Entreprise entr2=new Entreprise();
    
	
    @Test
    /**
     * verifier si la somme de salaire total d'entreprise egale 
     * à la somme attendue.
     */
  public void CalculeSoldeTest1() {

		entr1.addEmploye(emp1);
		entr1.addEmploye(emp2);
		entr1.addEmploye(emp3);
		entr1.addEmploye(ven1);
		entr1.addEmploye(ven2);
		
		double total =entr1.calculeSalaireTotal();
		
		assertEquals(total,8520.0,0);
		
  }
    /**
     * verifier si la somme de salaire total d'entreprise egale 
     * à la somme attendue.
     */
     @Test
     public void CalculeSoldeTest2() {

	  entr2.addEmploye(emp1);
	  entr2.addEmploye(emp2);
	  entr2.addEmploye(emp3);
	  entr2.addEmploye(emp4);
	  entr2.addEmploye(ven1);
	
	  double total =entr2.calculeSalaireTotal();
	
	  assertEquals(total,8410.0,0);
	
}
	
	

}
