package Pk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import ex1.employee;



public class Arrayvehicule {
	private Vehicule[] vehicule = new Vehicule[2];
	
	public Arrayvehicule() {
		
	}
	public void trier(Comparator<Vehicule> cmp) {
		Arrays.sort(vehicule, cmp);
	}
	public void remplir() {
		vehicule[0] = new Vehicule("BMW",2014) ;
		vehicule[1] = new Voiture("AUDI",2000,"A6",4);
		
	}
	public boolean tester(Vehicule veh) {
		for(Vehicule emp1 : vehicule )
			if(veh.equals(emp1))
				return true;
		return false;
	}

	public boolean supprimer(Vehicule veh) {
		if (!this.tester(veh))
			return false;
		ArrayList<Vehicule> liste = new ArrayList<Vehicule>(Arrays.asList(vehicule)) ;
	liste.remove(veh);
	vehicule = liste.toArray(new Vehicule[liste.size()]);
	return true;
		
	}
	public void inverser() {
		ArrayList<Vehicule> liste = new ArrayList<Vehicule>(Arrays.asList(vehicule)) ;
		Collections.reverse(liste);
		vehicule = liste.toArray(new Vehicule[liste.size()]);

	}
	public void Afficher() {
		for(Vehicule v : vehicule) {
			System.out.println(v);
		}
	}
	public boolean testerDeuxTab(Vehicule[] tab) {
		return Arrays.equals(vehicule, tab);
		
	}
	
}
