package centredeformation;

public class Cours implements Participable{
	private String titre;
	private String formateur;
	private int duree;
	private int placesRestantes;
	
	public Cours (String titre, String formateur, int duree, int placesRestantes) {
		this.setTitre(titre);
		this.setFormateur(formateur);
		this.setDuree(duree);
		this.setPlacesRestantes(placesRestantes);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getPlacesRestantes() {
		return placesRestantes;
	}

	public void setPlacesRestantes(int placesRestantes) {
		this.placesRestantes = placesRestantes;
	}
	
	public void montrerDetails() {
		System.out.println("Titre : " + this.titre);
		System.out.println("Formateur : " + this.formateur);
		System.out.println("Durée : " + this.duree);
		System.out.println("Nombre de places restantes : " + this.placesRestantes);
	}

	public void participer() {

	}

	public void quitter() {

		
	}
}
