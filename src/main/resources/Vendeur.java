
public class Vendeur extends Employer{
	
	private double commission;private m;
	
	public Vendeur(double commission) 
		super();
		this.commission=commission;
	}
	
	public Double calcule_salaire(int nbAnneeExperiance) {
		 
		 return super.calcule_salaire(nbAnneeExperiance)+commission;
	 }
}
