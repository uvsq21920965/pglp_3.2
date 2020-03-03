
public class Employer{

 private final double salaire_base;
 
 public Employer() {
	 
	 salaire_base=1500;
 }
 
 public double calcule_salaire(int nbAnneeExperiance) {
	 
	 return salaire_base+(20*nbAnneeExperiance);
 }
 
}
