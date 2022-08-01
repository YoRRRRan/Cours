import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre: ");
		// Affiche "Ecrire un nombre: "
		// Lit l'entier écrit par l'utilisateur et l'affecte
		// à la variable nombre du programme

		// variable secrete

		int nombre = scanner.nextInt();
		int nombrefixe = 66;
		
		do {
			nombre = scanner.nextInt();

			if (nombre < nombrefixe) {
				System.out.println("Votre chiffre est plus petit, retry");
			}

			// Si le nombre est plus grand
			if (nombre > nombrefixe) {
				System.out.println("Votre chiffre est plus grand, retry");
			}

			if (nombre == nombrefixe) {
				System.out.println("BRAVO");
			}

		} while (nombre != nombrefixe);

	}
}

// Affiche le nombre saisit par l'utilisateur
// System.out.println(nombre);

// un commentaire Java sur une ligne
// suivi d'une instruction qui affiche "Hello Java 4 !"
// System.out.println("Hello Java 4 !"); // commentaire très court
// System.out.println("deuxième ligne : toto");
/*
 * un commentaire sur plusieurs lignes le code à l'intérieur est ignoré int x =
 * 5;
 */

/*
 * on crée deux variables de type entier on les additionne et on affiche le
 * résultat dans la console !
 */
// int nb = 5;
// nb = 34; //je change la valeur contenue dans nb
//		nb = nb + 5;
//		nb += 5; //équivaut à la ligne précédente, en plus court
//		//attention aux lignes de code qui font plusieurs choses en même temps
//		System.out.println(nb += 5);
//		System.out.println(nb);
// int x = 0;
// x++; //équivalent à x = x + 1;
// ++x; //idem, mais petite différence dans l'ordre des actions
// TOUJOURS faire attention avec ce genre d'opérateur en paramètre de fonction !
//		System.out.println(x++);
//		System.out.println(x);

// int resultat = nb + x;
// System.out.println(resultat);

// exemple de différence entre float et double
// double nbVirgule = 5.5;
// float nbVirguleFloat = 5.5f;
// double resultatD = nbVirgule / 3;
// float resultatF = nbVirguleFloat / 3;
// exemple de conversion manuelle
// int test = (int)nbVirgule;
// System.out.println(test);
// exemple d'arrondi
// System.out.println(Math.round(resultatD));
// System.out.println(resultatD);
// System.out.println(resultatF);

// exemple de chaîne de caractères
//		String maChaine = "bonjour à tous";
//		String maChaine2 = " les Java";
//		System.out.println(maChaine + maChaine2);
