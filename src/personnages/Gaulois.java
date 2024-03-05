package personnages;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	// private String prendreParole() {
	// return "Le gaulois " + nom + ":";
	// }

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	// public void frapper(Romain romain) {
	// System.out.println(nom + "envoie un grand coup dans la mâchoire de " +
	// romain.getNom());
	// romain.recevoirCoup((force / 3) * effetPotion);
	// }

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public int boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
		return effetPotion;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain jojo = new Romain("Jojo", 6);
		asterix.prendreParole();
		asterix.parler("Hello world!");
		asterix.frapper(jojo);
		asterix.boirePotion(6);
		asterix.frapper(jojo);

	}

}
