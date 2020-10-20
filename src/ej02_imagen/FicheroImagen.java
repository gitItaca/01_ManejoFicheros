package ej02_imagen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroImagen {

	public static void main(String[] args) throws IOException {
		int contBytes = 0;
		try {
			FileInputStream fis = new FileInputStream("C:\\CLASE\\AC_DT\\ImagenFlorD.jpg");
			
			int valor = fis.read();
						
			while(valor != -1) {
				contBytes++;
				System.out.print((char)valor);
				valor = fis.read();
			}
			
			fis.close();
			
			System.out.println();
			System.out.println();
			System.out.println("El número de Bytes es de " + contBytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

		
	}//FIN MAIN

}//FIN FicheroImagen
