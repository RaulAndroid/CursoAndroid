package com.cice.tutorialjava.poo.colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cice.tutorialjava.poo.interfaces.Racional;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringSet=new HashSet<>();
		Set<Racional> myRacionalSet=new HashSet<>();
		myStringSet.add("Luis");
		myStringSet.add("Luis");
		myStringSet.add("Manuel");
		myStringSet.add("Pedro");
		myStringSet.add("Alberto");
		
		System.out.println("Recorriendo la lista con for each...");
		for(String str:myStringSet){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<String> it=myStringSet.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("iniciando prueba con Racionales...");
		myRacionalSet.add(new Racional (2,3));
		myRacionalSet.add(new Racional (1,3));
		myRacionalSet.add(new Racional (2,7));
		myRacionalSet.add(new Racional (9,3));
		myRacionalSet.add(new Racional (2,3));
		myRacionalSet.add(new Racional (4,6));
		myRacionalSet.add(new Racional (2,6));
		myRacionalSet.add(new Racional (3,9));
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<Racional> it2=myRacionalSet.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		//Pruebo a recorrer la lista comparando todos sus elementos
		//for (Racional r:myRacionalSet){
		//	for(Racional rac:myRacionalSet){
		//		System.out.println(r+" "+rac+" "+r.equals(rac));
		//	}
		//}
	}

}
