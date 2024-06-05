package centredeformation;

import java.sql.Date;

public class Etudiant extends individu{
	private Date dateInscription;
	private String niveauEtude;
	
	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public void montrerDetails() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Identifian : " + this.identifiant);
		System.out.println("Date d'inscription : " + this.dateInscription);
		System.out.println("Niveau d'étude : " + this.niveauEtude);
	}
}
