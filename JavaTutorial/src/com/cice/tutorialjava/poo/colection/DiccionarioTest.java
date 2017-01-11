package com.cice.tutorialjava.poo.colection;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Diccionario d=new Diccionario("palabras.txt");
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
