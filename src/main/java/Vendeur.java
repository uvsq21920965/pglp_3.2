/**
 * 
 * @author sarra Belmahdi.
 * 
 *Vendeur Classe.
 */
public class Vendeur extends Employe{
	/**
	 * commission
	 */
	private double commission;
	/**
	 *  Constructeur.
	 * @param nbAnneeExperiance : nombre d'annee d'experience.
	 * @param commission : commission du vendeur.
	 */
	public Vendeur(int nbAnneeExperiance,double commission) {
		super(nbAnneeExperiance);
		this.commission=commission;
	}

	/**
	  * calcule salaire du vendeur .
	  * @return salaire du vendeur.
	  */
	public double calculeSalaire() {
		 return super.calculeSalaire()+commission;
	 }

}
