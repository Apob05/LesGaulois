package personnages;

public class Musee {
	Equipement[] trophee = new Equipement[200];
	int nbTrophee = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophee[nbTrophee] = equipement;
		nbTrophee++;
	}

}
