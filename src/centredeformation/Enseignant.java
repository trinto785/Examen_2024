package centredeformation;

public class Enseignant extends individu {
	private String specialisation;
	private double salaireMensuel;

	public Enseignant(String nom, String prenom, int identifiant, String specialisation, double salaireMensuel) {
		super(nom, prenom, identifiant);
		this.setSpecialisation(specialisation);
		this.setSalaireMensuel(salaireMensuel);
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	public void montrerDetails() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Identifian : " + this.identifiant);
		System.out.println("Specialisation : " + this.specialisation);
		System.out.println("Salaire Mensuel : " + this.salaireMensuel);
	}
}
