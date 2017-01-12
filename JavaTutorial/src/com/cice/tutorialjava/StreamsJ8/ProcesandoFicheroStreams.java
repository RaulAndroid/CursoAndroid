package com.cice.tutorialjava.StreamsJ8;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//utilizamos lambdas para implmentar el metodo forEach
			Files.lines(Paths.get("palabras2.txt"))
			//Filtramos lineas de tamaño mayor a 10
			.filter(line->line.length(>10)
			//definimos una accionpor cada elemento emitido
			.forEach(line->System.out.println(line));
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
