package fr.uvsq21920965.pglp32;
/**
 * @author Sarra Belmahdi.
 * Manager classe.
 */
public class Manager extends Employe {
/**
* nombre d'employes sous ordres de manager.
*/
private int nbEmploye;
/**
 * constructeur.
 * @param nbAnneeExperienceAtt nb annee d'experience.
 * @param nbEmployeAtt nb employes sous sonordre
 */
 public Manager(final int nbAnneeExperienceAtt, final int nbEmployeAtt) {
  super(nbAnneeExperienceAtt);
  this.nbEmploye = nbEmployeAtt;
 }
/**
 * calcule salaire du manager.
 * @return salaire du manager.
 */
 public double calculeSalaire() {
  final int prime = 100;
  return super.calculeSalaire() + (prime * nbEmploye);
 }
}
