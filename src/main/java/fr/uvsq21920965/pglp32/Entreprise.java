package fr.uvsq21920965.pglp32;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarra Belmahdi.
 * Entreprise Classe.
 */
public class Entreprise {
/**
* liste des emloyes.
*/
private List<Employe> listeEmployes;
/**
 * constructeur.
 */
 public Entreprise() {
  listeEmployes = new ArrayList<Employe>();
 }
/**
 * ajouer des employes.
 * @param emp : employe.
 */
 public void addEmploye(final Employe emp) {
  listeEmployes.add(emp);
  }
 /**
 * calcule la somme totale des salaires de l'entreprise.
 * @return total: la somme des salaire de l'entreprise.
 */
 public double calculeSalaireTotal() {
  double total = 0;
  for (Employe em :listeEmployes) {
   total += em.calculeSalaire();
  }
  return total;
 }
}

