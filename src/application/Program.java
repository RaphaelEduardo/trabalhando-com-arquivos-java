package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		//caminho do arquivo...
		File file = new File("C:\\temp\\teste.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			//testar se existe uma proxima linha no arquivo.
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		//é executado independente do try/catch.
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		
	}
}
