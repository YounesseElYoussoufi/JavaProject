package Pk1;

import java.util.Objects;

public class Voiture extends Vehicule {
    
    private String modele;
    private int nombrePortes;

    
    public Voiture(String marque, int anneeFabrication, String modele, int nombrePortes) {
        super(marque, anneeFabrication);
        this.modele = modele;
        this.nombrePortes = nombrePortes;
    }

  
    

    
    @Override
	public String toString() {
		return "Voiture [modele=" + modele + ", nombrePortes=" + nombrePortes + ", toString()=" + super.toString()
				+ "]";
	}





	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return nombrePortes == voiture.nombrePortes &&
                Objects.equals(modele, voiture.modele) &&
                super.equals(o); 
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), modele, nombrePortes);
    }

    
    @Override
    public Object clone() {
        Voiture clone = (Voiture) super.clone(); 
        clone.modele = this.modele;
        clone.nombrePortes = this.nombrePortes;
        return clone;
    }

    
    public void klaxonner() {
        System.out.println("La voiture de marque " + marque + " klaxonne !");
    }
}
