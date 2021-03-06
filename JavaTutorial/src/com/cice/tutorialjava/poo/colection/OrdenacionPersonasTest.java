package com.cice.tutorialjava.poo.colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cp.cice.tutorialjava.poo.Persona;

public class OrdenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Persona> list=new ArrayList<>();
		list.add(new Persona("Luis",24));
		list.add(new Persona("Manuel",25));
		list.add(new Persona("Jose",34));
		list.add(new Persona("Juan",28));
		list.add(new Persona("Lucia",29));
		list.add(new Persona("Lucas",44));
		Collections.sort(list, new Comparator<Persona>(){
			//Hago una implementacion anonima del interfaz Comparator
			public int compare (Persona o1, Persona o2){
				return o1.getEdad()-o2.getEdad();
			}
		// con la expresion lambda sería asi:
		// Collections.sort(list,(01,02)->01.getEdad()-o2.getEdad());
		// y no haría falta definir el método
		});
		for(Persona p:list){
			p.print();
		}
	}
}
