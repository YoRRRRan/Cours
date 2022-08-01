package Cours;

public class Cours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// exemple d'utilisation des fonctions en Java
			
			//je scanne un nombre entier
//			System.out.println("Entrez un nombre entier");
//			Scanner scan = new Scanner(System.in);
//			int res = scan.nextInt();
//			scan.close(); //une fois qu'on a fini pour de bon de s'en servir, on ferme le scanner
			//plutôt que de coder ça en dur, je crée une fonction pour le réutiliser
			
			//j'ai le droit de réutiliser directement le résultat retourné par la fonction
//			System.out.println("le nombre entré est " + scanInt());
//			System.out.println("Le programme continue pendant un certain nombre d'opérations...");
//			System.out.println("et puis on a besoin d'entrer un autre nombre !");
//			
//			System.out.println("résultat renvoyé par la fonction scanInt : ");
//			//appel de la fonction scanInt
//			int resultat = scanInt(); //je peux stocker le résultat retourné dans une variable
//			System.out.println(resultat);

			//appel de fonction paramétrée
			boolean pos = isPositive(12);
			System.out.println(pos);
			System.out.println(isPositive(scanInt()));
			
			//test sur le fonctionnement des paramètres
			int nbTest = scanInt();
			System.out.println("valeur initiale : " + nbTest);
//			plusFive(nbTest);
//			System.out.println("valeur nouvelle : " + nbTest);
			
			double nbDecimal = scanDouble();
			//isPositive appelle la version pour int ou pour double selon le typage de ses paramètres
			System.out.println(isPositive(nbDecimal));
			
		}
		
		//fonction qui demande l'entrée d'un nombre entier à l'utilisateur
		//et retourne le nombre scanné
		
		//signature de la fonction :
		//accessModifier (option)static typeRetour nomFonction((option)arguments)
		public static int scanInt() {
			System.out.println("Entrez un nombre entier");
			Scanner scan = new Scanner(System.in);
			int res = scan.nextInt();
			//la fermeture du Scanner nous permettrait d'économiser de la mémoire...
			//mais pour le moment ça nous déclenche une exception, et on a pas encore vu comment les gérer...
			//scan.close();
			return res; //renvoie le résultat
			
		}
		
		public static double scanDouble() {
			System.out.println("Entrez un nombre à virgule");
			Scanner scan = new Scanner(System.in);
			double res = scan.nextDouble();
			//la fermeture du Scanner nous permettrait d'économiser de la mémoire...
			//mais pour le moment ça nous déclenche une exception, et on a pas encore vu comment les gérer...
			//scan.close();
			return res; //renvoie le résultat
			
		}
		
		//vérifie si le nombre est positif
		//si oui renvoie true, sinon renvoie false
		//si on a besoin de données extérieures, on passe par un paramètre
		public static boolean isPositive(int test) {
			boolean retour;
			if(test > 0) {
				return true;
			}else {
				return false;
			}
			//syntaxe alternative
//			boolean retour = false;
//			if(test > 0) {
//				retour = true;
//			}
//			return retour;
		}
		
		//la même pour les nombres à virgule
		public static boolean isPositive(double test) {
			boolean retour;
			if(test > 0) {
				return true;
			}else {
				return false;
			}
		}
		
		//fonction qui ajoute 5 à la valeur d'un nombre entier
		//attention : les types primitifs sont passés par valeur : on travaille avec une simple copie !
//		public static void plusFive(int nb) {
//			nb += 5;
//			System.out.println("valeur modifiée dans la fonction : " + nb);
//			//TOUJOURS faire un retour pour récupérer cette valeur !
	}

}
