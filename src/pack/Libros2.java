package pack;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Libros2 {

	public static void main(String[] args) {
		/*String texto = "<Libros><Libro><Titulo>100 a�os de soledad<Titulo><Libro><Libros>";
		String nombre = "libros.xml";*/
		String textoFichero = "100 a�os de soleda";
		String nombreFichero = "fichero1.txt";
		
		
		/*try {
			FileWriter fw = new FileWriter(nombre);
			
			fw.write(texto + "\r\n");
			fw.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}*/		
		
		try (FileWriter fw_ficheros = new FileWriter(nombreFichero);
			FileReader fr_ficheros = new FileReader(nombreFichero);){
			
			
			fw_ficheros.write(textoFichero);
			fw_ficheros.write(100);
			fw_ficheros.flush();
			
			
			
			//Leemos el fichero y lo mostramos por pantalla
			int valor = fr_ficheros.read();
						
			while(valor!=-1) {
				System.out.print((char)valor);
				valor = fr_ficheros.read();
			}		
			
		} catch (IOException e) {			
			System.out.print("ERROR");
		}
	}//FIN main

}//FIN libros
