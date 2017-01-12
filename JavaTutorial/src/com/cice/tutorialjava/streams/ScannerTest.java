package com.cice.tutorialjava.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(new FileInputStream("palabras2.txt"));
			//Al estar en JAVA la expresión regularlleva \\
			//sc.useDelimiter("\\s*bla\\s*");
			// Ahora en lugar de la expresion regular obtenemos los enteros
			float suma=0;
			while(sc.hasNext()){
				try{
					float x=sc.nextFloat();
					System.out.println("Numero "+ x);
					suma=suma+x;
				}catch(InputMismatchException e){
					sc.next();
				}
			}
			System.out.println("Suma "+ suma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
