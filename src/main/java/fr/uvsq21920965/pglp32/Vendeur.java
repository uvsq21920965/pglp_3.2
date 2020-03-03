package fr.uvsq21920965.pglp32;


/**
 *
 * @author sarra Belmahdi.
 * Vendeur Classe.
 */
public class Vendeur extends Employe {
/**
* Commission.
*/
private double commission;
/**
 * Constructeur.
 * @param nbAnneeExperiance : nombre d'annee d'experience.
 * @param commissionAtt : commission du vendeur.
 */
 public Vendeur(final int nbAnneeExperiance, final double
  commissionAtt) {
  super(nbAnneeExperiance);
  this.commission = commissionAtt;
  }
/**
 * calcule salaire du vendeur .
 * @return salaire du vendeur.
 */
 public double calculeSalaire() {
  return super.calculeSalaire() + commission;
 }
}

