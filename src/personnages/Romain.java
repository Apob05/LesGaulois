package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
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

	public int sEquiper(Equipement equipement) {
		
		switch (equipement) {
		case BOUCLIER: {
			
		}
		case CASQUE{
			
		}
		default:
			throw new ;
		}
		
		return ;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
	}

}
