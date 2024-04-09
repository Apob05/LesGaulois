package personnages;

public class Musee {
	Equipement[] trophee = new Equipement[200];
	int nbTrophee = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophee[nbTrophee] = equipement;
		nbTrophee++;
	}

	public String extraireInstructionsOCaml() {
		String ocamlInstructions = "let musee = [\n";
		for (int i = 0; i < nbTrophee; i++) {
			ocamlInstructions += "    \"" + trophee[i].getGaulois().getNom() + "\", \"" + trophee[i].toString()
					+ "\";\n";
		}
		ocamlInstructions += "]";
		return ocamlInstructions;
	}

}
