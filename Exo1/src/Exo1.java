import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Exo1 {

	// Exercice 1
	public static String exercice1() { // on definit la fonction de l'exercice 1 () - static est obligatoire pour être
										// appelée dans la fonction main
		Scanner reponse = new Scanner(System.in); // On créé un scanner permettant d'interagir avec l'utilisateur
		System.out.println("Choisis un mot : "); // indication pour l'utilisateur : que doit-il faire ?
		String monMot = reponse.nextLine(); // On récupère la chaine de caractère rentrée par l'utilisateur et on la
											// stoque dans la variable monMot
		reponse.close(); // on ferme le scanner
		int longueur = monMot.length(); // on récupère la longueur de la chaine stoquée dans la variable monMot et on la
										// met dans longueur
		return monMot + " a une longueur de " + longueur; // on fait ressortir la reponse
	}

	public static String exercice2() {
		Scanner reponse = new Scanner(System.in); // On créé un scanner permettant d'interagir avec l'utilisateur
		System.out.println("Ecrit une phrase : "); // indication pour l'utilisateur : que doit-il faire ?
		String monMot = reponse.nextLine(); // On récupère la chaine de caractère rentrée par l'utilisateur et on la
											// stoque dans la variable monMot
		reponse.close(); // on ferme le scanner

		String[] Mots = monMot.toLowerCase().split(" "); // on transforme toutes les lettres en minuscule et on met
															// chaque mot de la phrase dans une cellule d'un tableau

		for (int i = 0; i < Mots.length; i++) { // On parcours le tableau contenant tous les mots de la phrase - i est
												// l'index qui nous permettra de cibler les mots un par un
			if (Mots[i].length() > 0) { // Si le mot existe - si le mot n'est pas vide
				Mots[i] = Mots[i].substring(0, 1).toUpperCase() + Mots[i].substring(1);
				// on prend la premiere lettre avec substring(0,1) qu'on met en majuscule puis
				// on concatene/colle le reste du mot substring(1) = tout le mot à partir de la
				// deuxième lettre (puisque le début c'est 0) = tout le mot sauf la première
				// lettre
			}
		}

		// monMot = monMot.toLowerCase();
		// monMot = monMot.substring(0,1).toUpperCase()+monMot.substring(1);
		// return monMot;
		return String.join(" ", Mots); // on transforme le tableau en chaine de caractère en rajoutant des espaces
	}

	public static ArrayList exercice4fonction1() {
		int valeur;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Scanner reponse = new Scanner(System.in); // On créé un scanner permettant d'interagir avec l'utilisateur
		
		do {
			System.out.println("Donne moi un nb"); // indication pour l'utilisateur : que doit-il faire ?
			valeur = reponse.nextInt();
			myList.add(0, valeur);
				} while (valeur > 0);
		
		reponse.close();
		return  myList;
	}

	

	

	public static void main(String[] args) {
		// String msg = exercice1();
		// System.out.println(msg) ;

		// System.out.println(exercice1()); // on appelle la fonction exercice1 et on
		// affiche le retour de la fonction
		System.out.println(myList);
		System.out.println(exercice4fonction1());
	}
}