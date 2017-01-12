package com.cice.tutorialjava.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Como el separador de directorios depende del SO donde se ejecute el programa puede que cambie por lo
		//que esta es la manera más segura
		String fs=System.getProperty("file.separator");
		File file=new File("src"+fs+"com"+fs+"cice"+fs+"tutorialjava"+fs+"ArrayTest.java");
		//Comprobamos si el fichero existe
		if(file.exists()){
			try (InputStream in=new FileInputStream(file);OutputStream out=new FileOutputStream("copy.txt)")){
				int bytesLeidos=0;
				byte[]buffer=new byte[1024];
				System.out.println("Inicndo la copia de ficheros...");
				/*while((byteLeido=in.read())!=-1){
					out.write(byteLeido);
					
			} */
			do{
				bytesLeidos=in.read(buffer);
				if(bytesLeidos>0){
					out.write(buffer,0,bytesLeidos);
				}
			// Leo hasta que la info leida sea igual a la capacidad del buffer
			}while(bytesLeidos==buffer.length);
			
			System.out.println("Copia de ficheros terminada...");

			}catch (FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			
				
			}
			
		}
		
		
	}

}
