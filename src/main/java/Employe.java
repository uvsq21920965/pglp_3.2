     
     /**
	 * @author Sarra Belmahdi.
	 * 
	 * Employe classe.
	 */
	public class Employe{
	     /**
	      * salaire de base fixe.
	      */
		 private final double salaire_base;
		 /**
		  * nombre d'annee d'experience.
		  */
		 private int nbAnneeExperience;
		 
		 /**
		  * constructeur. 
		  * @param nbAnneeExperience :nombre d'experience.
		  */
		 public Employe(int nbAnneeExperience){
			 this.nbAnneeExperience= nbAnneeExperience;
			 salaire_base=1500;
		 }
		 /**
		  * calcule salaire de l'employe.
		  * @return salaire d'employe.
		  */
		 public double calculeSalaire() {
			 final int prime=20;
			 return salaire_base+(prime*nbAnneeExperience);
		 }
	}
 

