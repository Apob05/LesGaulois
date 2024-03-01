package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public int ajouterHabitant(Gaulois gauloi) {
		if (nbVillageois >= nbVillageoisMaximum) {
			System.out.println("Le village est plein, le gauloi " + gauloi.getNom() + " devra vire dans la rue.");
			return nbVillageois;
		} else {
			villageois[nbVillageois] = gauloi;
			return nbVillageois += 1;

		}

	}

	public Gaulois trouverHabitant(int numHabitant) {
		if (numHabitant > nbVillageois || numHabitant <= 0) {
			System.out.println("Ce villageois n'existe pas.");
		} else {
			System.out.println("Le habitant numero " + numHabitant + " est " + villageois[numHabitant - 1]);
			return villageois[numHabitant - 1];
		}
		return null;
	}

	public void afficherVillageois() {
		System.out.println("Dans le " + nom + " du chef " + chef.getNom() + " vivent les legendaires gaulois:");
		for (int numDuVillageois = 0; numDuVillageois < nbVillageois; numDuVillageois += 1) {
			System.out.println("- " + villageois[numDuVillageois].getNom());
			;

		}
	}

	public static void main(String[] args) {
		Village villeDesIrreductbles = new Village("Village des Irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, villeDesIrreductbles);
		villeDesIrreductbles.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 6);
		Gaulois obelix = new Gaulois("Obélix", 25);
		villeDesIrreductbles.ajouterHabitant(asterix);
		villeDesIrreductbles.ajouterHabitant(obelix);
		Gaulois gaulois = villeDesIrreductbles.trouverHabitant(1);
		villeDesIrreductbles.afficherVillageois();
		// System.out.println(gaulois);
		// villarriba.trouverHabitant(30);

	}

}
