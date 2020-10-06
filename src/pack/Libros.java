package pack;

import java.io.FileWriter;

import java.io.IOException;

public class Libros {

	public static void main(String[] args) {
		String texto = "<Libros><Libro><Titulo>100 años de soledad<Titulo><Libro><Libros>";
		String nombre = "libros.xml";
		
		try {
			FileWriter fw = new FileWriter(nombre);
			
			fw.write(texto + "\r\n");
			fw.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}//FIN libros
