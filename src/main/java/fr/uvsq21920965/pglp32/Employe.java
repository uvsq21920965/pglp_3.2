package fr.uvsq21920965.pglp32;

/**
 * @author Sarra Belmahdi.
 * Employe classe.
 */

public class Employe {
/**
* salaire de base fixe.
*/
private static final double SALAIRE_BASE = 1500;
/**
* nombre d'annee d'experience.
*/
private int nbAnneeExperience;

/**
 * constructeur.
 * @param nbAnneeExperienceAtt :nombre d'experience.
 */
 public Employe(final int nbAnneeExperienceAtt) {
  this.nbAnneeExperience = nbAnneeExperienceAtt;
 }

/**
 * calcule salaire de l'employe.
 * @return salaire d'employe.
 */
 public double calculeSalaire() {
  final int prime = 20;
  return SALAIRE_BASE + (prime * nbAnneeExperience);
 }
}
