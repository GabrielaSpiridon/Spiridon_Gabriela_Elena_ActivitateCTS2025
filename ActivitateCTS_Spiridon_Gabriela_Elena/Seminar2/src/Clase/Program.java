package Clase;

import Reader.AngajatiReader;
import Reader.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader = new AngajatiReader("angajati.txt");
		try {
			listaAplicanti = baseReader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
