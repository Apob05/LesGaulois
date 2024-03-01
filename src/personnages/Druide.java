package personnages;

import java.util.Random;
import personnages.Gaulois;


public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPocionMin, int effetPocionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPocionMin;
		this.effetPotionMax = effetPocionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide " + nom + ":";
	}

	public int preparePotion() {
		Random random = new Random();
		int variationEffet = effetPotionMax - effetPotionMin + 1;
		int Rang = random.nextInt(variationEffet);
		forcePotion = effetPotionMin + Rang;
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force " + forcePotion + ".");
			return forcePotion;
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion + ".");
			return forcePotion;
		}
	}

		public void booster(Gaulois gaulois) {
			int effetPotion = this.forcePotion;
			if(gaulois.getNom() == "Obélix") {
				parler("Non, Obélix !... Tu n’auras pas de potion magique !");
			}else {
			gaulois.boirePotion(effetPotion);
			}
		}
		
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

	}
}







