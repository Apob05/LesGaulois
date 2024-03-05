package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		assert force > 0;
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
		return "le romain " + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forceDebut = force;
		force -= forceCoup;
		int forceFin = force;
		if (force > 0) {
			parler("Aïe");

		} else {
			parler("J'abandonne...");
			;

		}
		assert forceDebut > forceFin;
	}

	public void sEquiper(Equipement equipement) {
		if (nbEquipement > 0) {

			switch (nbEquipement) {
			case 1:
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + this.getNom() + " possède déjà un " + equipements[0] + " !");
					return;
				}
			case 2:
				if (equipements[1] != null) {
					System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
					return;
				}
			}
		}

		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement + ".");
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

	}

}
