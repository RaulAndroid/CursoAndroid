package com.cice.tutorialjava.StreamsJ8;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			/* Ejemplo Prueba de split
			 * String[] tokens="luis manuel bla 24 67 juan 23,9 89".split("\\s+");
			for(String token:tokens{
				System.out.println(token);
			}
			Stream.of(tokens)
			.forEach(token->System.out.println(token)); */
		try{
			//utilizamos lambdas para implmentar el metodo forEach
			
			//Files.lines(Paths.get("palabras2.txt"))
			Serializable opt=Files.lines(Paths.get("palabras2.txt"))
					
			//Filtramos lineas de tamaño mayor a 10
			//.filter(line->line.length()>10)
			//Hacemos un mapa con la longitud de cada observable (en este caso linea)
			//.map(line->line.length())			
			
			.flatMap(line->Stream.of(line.split("\\s+")))
			//filtramos únicamente los números
			.filter(token->{
							try{
								Double.parseDouble((String)token);
								return true;
								}catch(NumberFormatException e){
									return false;
								}
							}
				
			).mapToDouble(x->Double.parseDouble(x.toString()))
			.reduce(0,(x,y)->(x+y));
			System.out.println(opt);
			//definimos una accion por cada elemento emitido
			//.forEach(token->System.out.println(token));
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
