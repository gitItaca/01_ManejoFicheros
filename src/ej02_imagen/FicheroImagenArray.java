package ej02_imagen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroImagenArray {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> ListaDatos = new ArrayList<Integer>();		
		
		meterDatosLeidosEnArray(ListaDatos);
		contadorBytes(ListaDatos);
		
	}//FIN MAIN
	
//METODOS
	public static void contadorBytes(ArrayList<Integer> Lista) {
		System.out.println();
		System.out.println();
		System.out.println("El número de Bytes es de " + Lista.size() );
		
	}
	
	public static ArrayList<Integer> meterDatosLeidosEnArray(ArrayList<Integer> Lista)throws IOException {
		try {
			FileInputStream fis = new FileInputStream("C:\\CLASE\\AC_DT\\ImagenFlorD.jpg");
			
			int valor = fis.read();
						
			while(valor != -1) {
				//contBytes++;
				System.out.print((char)valor);
				Lista.add(valor);
				valor = fis.read();				
			}
			
			fis.close();			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return Lista;
	}//FIN MAIN

}//FIN FicheroImagenArray
