import java.util.ArrayList;
import java.util.*;

public class Entreprise {
	
	/**
	 * liste des emloyes.
	 */
	private List <Employe>listeEmployes;
	
	/**
	 * constructeur
	 */
	public Entreprise() {
		listeEmployes = new ArrayList<Employe>();
	}
	/**
	 * ajouer des employes
	 */
	public void addEmploye(Employe emp) {
		listeEmployes.add(emp);
	}
	/**
	 * calcule la somme totale des salaires de l'entreprise.
	 */
	public double calculeSalaireTotal() {
		double total=0;
		for (Employe em :listeEmployes) 
			total += em.calculeSalaire();
		return total;
		
	}

}
