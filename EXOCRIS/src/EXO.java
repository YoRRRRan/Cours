import java.util.Scanner;

public class EXO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ex Fonctions en JAVA

		System.out.println("Le nombre entré est = " + scanInt());

		int resultat = scanInt();
		System.out.println(resultat);
		System.out.println("C'est positif ? " + isPositive(scanInt()));
		
		
		System.out.println("Valeur initiale : "+scanInt());
		System.out.println("Valeur finale : "+ plusFive(scanInt()));
	}

	// Fonction Scanner
	public static int scanInt() {
		System.out.println("Entrez un nbre");
		Scanner sc = new Scanner(System.in);
		int nbre = sc.nextInt();

		// sc.close();
		return nbre;
	}

	// Fonction Verification positif or négatif (Boolean)
	public static boolean isPositive(int test) {
		if (test > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Fonction Rajouter 5
	public static int plusFive(int nb)	{
		nb += 5;
		return nb;
	}
}
