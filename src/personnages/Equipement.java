package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private String nom;

	private Equipement(String nom, Gaulois gaulois) {
		this.nom = nom;
		this.gaulois = gaulois;
	}

	private void Equipements(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	private Gaulois gaulois;

	private void Equipements(String nom, Gaulois gaulois) {
		this.nom = nom;
		this.gaulois = gaulois;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}
}