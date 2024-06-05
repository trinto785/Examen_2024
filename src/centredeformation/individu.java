package centredeformation;

public abstract class individu {
	protected String nom;
	protected String prenom;
	protected int identifiant;
	
	public individu (String nom, String prenom, int identifiant) {
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public void montrerDetails() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Identifiant : " + this.identifiant );
	}
}

