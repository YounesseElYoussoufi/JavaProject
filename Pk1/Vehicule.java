package Pk1;

import java.util.Objects;



public class Vehicule implements Comparable<Vehicule> {
    
    public String marque;
    public int anneeFabrication;

    
    public Vehicule(String marque, int anneeFabrication) {
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
    }

   
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "marque='" + marque + '\'' +
                ", anneeFabrication=" + anneeFabrication +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return anneeFabrication == vehicule.anneeFabrication &&
                Objects.equals(marque, vehicule.marque);
    }

    
    
    @Override
    public Object clone() {
    	try {
			return (Vehicule) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.err.println("erreur de clonage");
			return null;
		}
    }

   
    @Override
    public int compareTo(Vehicule autreVehicule) {
        
        return Integer.compare(this.anneeFabrication, autreVehicule.anneeFabrication);
    }
}
