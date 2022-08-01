

import java.util.Scanner;

public class Utils {

	
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ret = scan.nextLine();
		// scan.close();
		return ret;
	}


	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer ret;
		
		// le bloc try catch : comment attraper les exceptions et éviter les
		// problèmes qu'on ne contrôle pas; pas forcement tous mais sera utile dans 
		// tout les cas où vous intéragissez avec des éléments extérieurs au programmes
		
		// on essaye d'éxecuter ce morceau de code
		try {
			Scanner scan = new Scanner(System.in);
			ret = scan.nextInt();
		} catch (Exception exception) {
			// return 0;
			// si un problème est detecté on retourne une ligne de code.
			return scanInteger("Entrez un nombre entier SVP ?");
		}finally {
			// si ce bloc est présent, le code à l'intérieur est exécuté.
		}

		// scan.close();
		return ret;
	}
}
