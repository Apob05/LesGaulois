package personnages;

public class Gaulois {
	private String nom;
	private int force;
	int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

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
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees1 = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees1 != null && i < trophees1.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees1[i];
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public int boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
		return effetPotion;
	}

	public void faireUneDonnation(Musee musee) {
		if (nbTrophees > 0) {
			parler("Je donne au musée tous mes trophées !");
			for (int i = 0; i < nbTrophees; i++) {
				System.out.println(" - " + trophees[i]);
				musee.donnerTrophees(this, trophees[i]);
				nbTrophees--;
			}
		}
	}


	public static void main(String[] args) {
		Musee museum = new Musee();
		Gaulois asterix = new Gaulois("Asterix", 8);
		asterix.faireUneDonnation(museum);
	}

}
