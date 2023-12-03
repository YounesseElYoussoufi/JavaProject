package Pk1;

import java.util.LinkedList;
import java.util.List;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ListVehicule {
	private LinkedList <Vehicule> vehicule = new LinkedList<Vehicule>();
	//a.	Codez une fonction Java qui permet d’alimenter la liste.
	public void alimenter() {
		vehicule.add(new Vehicule("BMW",2014));
		vehicule.add(new Voiture("AUDI",2000,"A6",4));
	}
	//b.	Codez une fonction Java qui permet d’afficher la liste (ligne par ligne).
	public void Afficher() {
		for(Vehicule v : vehicule) {
			System.out.println(v);
		}
	}
	//c.	Codez une fonction Java qui permet de parcourir (à l’aide d’un Iterateur) tous les éléments de la liste.
	public void AfficherIterator() {
		Iterator<Vehicule> it = vehicule.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//e.	Codez une fonction Java qui permet de récupérer un élément 
	public Vehicule recuperer(int pos) {
		if(pos>=0&&pos<vehicule.size())
			return vehicule.get(pos);
		else
			throw new IllegalArgumentException();
	}
	//f.	Codez une fonction Java qui permet de supprimer un élément.
	public boolean suprimer(Vehicule veh) {
		return vehicule.remove(veh);
	}
	//g.	Codez une fonction Java qui permet de rechercher un élément.
	public boolean rechercher(Vehicule veh) {
		return  vehicule.contains(veh);
	}
	//h.	Codez une fonction Java qui permet de trier la liste
	public void trier(Comparator<Vehicule>cmp) {
		  Collections.sort(vehicule,cmp);
	}
	//i.	Codez une fonction Java qui permet de copier la liste dans un nouveau tableau.
	public ArrayList<Vehicule> copier()
	{
		//return new ArrayList<employee>(employes)
		ArrayList<Vehicule> list =new ArrayList<Vehicule>();
		list.addAll(vehicule);
		return list;
	}
	//j.	Codez une fonction Java qui permet de mélanger les élément de la liste.
	public void melanger() {
	    Collections.shuffle(vehicule);
	}
	//k.	Codez une fonction Java qui permet d’inverser les éléments de la liste.
	public void reverser() {
	    Collections.reverse(vehicule);
	}
	//l.	Codez une fonction Java qui permet d’extraire une partie de la liste.
	public List<Vehicule> sousList(int deb,int fin){
		if(deb>0&&deb<fin)
		return vehicule.subList(deb, fin);
		throw new IllegalArgumentException();
	}
	//m.	Codez une fonction Java qui permet de comparer deux listes.
	public boolean comparer(ArrayList<Vehicule> list) {
		return vehicule.equals(list);
		
	}
	//n.	Codez une fonction Java d'échange de deux éléments dans une liste.
	public void echanger(int in1 , int in2)
	{
		Collections.swap(vehicule, in1, in2);

	}
	//o.	Codez une fonction Java qui permet de vider la liste.
	public void vider() {
		vehicule.clear();
	}
	//p.	Codez une fonction Java qui permet de tester que la liste est vide ou non.
	public boolean estvide() {
		return vehicule.isEmpty();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
