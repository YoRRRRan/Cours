package exemplesConditionsEtBoucles;

import java.util.ArrayList;
import java.util.Arrays;
//import d'une classe supplémentaire utilisée par mon code
import java.util.Scanner;

public class BouclesetConditions {

	public static void main(String[] args) {
		// exemples d'utilisation des structures de contrôles en Java
		//conditions et boucles
		
		//la condition if
		boolean test = true;
		//si la condition entre parenthèses est vraie
		if(test == true) {
			System.out.println("ma condition est vraie");
		}
		else if(test == false) {
			//en option : sinon si la deuxième condition est vraie, on affiche ce texte-là
			System.out.println("ma condition est fausse");
		}else {
			//si aucune des deux n'est vraie on affiche le dernier texte
			System.out.println("erreur : variable non initialisée");
		}
		
		//la boucle for
		//utile si on sait combien de temps on doit boucler
		//en trois parties :
		//initialisation du compteur ; condition de continuité ; 
		for(int i=0 ; i<10 ; i++) {//dès que i est égal à 10, on sort de la boucle
			//j'imprime à chaque tour la valeur actuelle du compteur
			System.out.println("valeur actuelle du compteur " + i);
			
		}//à la fin du tour, j'incrémente i : je rajoute 1 à sa valeur
		
		//la boucle while
		
		//un exemple d'entrée utilisateur : le Scanner
		//c'est un objet (on va en reparler) qui va permettre de gérer les entrées utilisateur
		Scanner scanNombre = new Scanner(System.in);
		//j'initialise la variable avant la condition de boucle
		int nbScanneW = 0;
		while(nbScanneW <= 0) { //tant que la condition est vérifiée, on continue de boucler
			System.out.println("entrez un nombre positif !");
			//je scanne un nombre et je le range dans une variable
			nbScanneW = scanNombre.nextInt();
		}
		//la boucle do while
		int nbScanneD;
		//même principe que while, mais
		do {
			//on boucle toujours AU MOINS UNE FOIS
			System.out.println("entrez un nombre positif !");
			//je scanne un nombre et je le range dans une variable
			nbScanneD = scanNombre.nextInt();
		}while(nbScanneW <= 0); //on vérifie la condition A LA FIN DU TOUR

		// les tableaux et les listes en Java
				// ou : Comment stocker des choses ensemble rapidement
				
				//le tableau Java
				//on stocke plusieurs éléments de même type
				//on donne la taille que doit faire le tableau à l'avance
				int[] tabEntiers = new int[5];
				tabEntiers[0] = 34;
				tabEntiers[1] = 12;
				tabEntiers[2] = 47;
				//ou alors
				//int[] tabEntiers = {34,12,47,0,0};
				System.out.println(tabEntiers); //attention à l'affichage des objets !
				//Arrays : classe utilitaire pour manipuler les tableaux
				//la méthode Arrays.toString() permet de transformer le tableau en String
				System.out.println(Arrays.toString(tabEntiers));
				//si on avait pas de méthode spécifique, on peut toujours se le faire à la main !
				//length : la taille du tableau, son nombre d'éléments possibles
				for(int i=0;i<tabEntiers.length;i++) {
					//à chaque tour de boucle, on en affiche un
					System.out.println(tabEntiers[i]);
				}
				
				//on peut faire un tableau de tableaux
				//ici, un tableau vide contenant jusqu'à 5 tableaux de 5 entiers
				//int[][] tabTabEntiers = new int[5][5];
				//le même en prérempli
				int[][] tabTabEntiers = {{5,3,1,2,4},{4,4,4,4,4},{4,4,4,4,4},{4,4,4,4,4},{4,4,4,4,4}};
				for(int i=0;i<tabEntiers.length;i++) {
					//à chaque tour de boucle, on affiche un sous-tableau
					System.out.println(Arrays.toString(tabTabEntiers[i]));
				}
				
				//la chaîne de caractères peut aussi être transformée en tableau de caractères
				String nom = "cyril";
				nom = nom.toUpperCase(); //fonction utilitaire qui met tout en majuscule
				char[] tabNom =nom.toCharArray();
				System.out.println(Arrays.toString(tabNom));
				System.out.println(nom.length());
				
				
				
				//inconvénient principal du tableau : structure TRES rigide
				//on ne peut pas changer sa taille
				//et il consomme donc des ressources importantes si on y stocke des objets
				
				
				
				//on préfèrera presque toujours les collections, comme l'ArrayList par exemple
				
				//les listes en Java : exemple avec ArrayList
				
				//je crée et initialise une liste vide
				//si je veux être prudent je précise le type de données avec lequel je travaille
				ArrayList<Integer> maListeNombres = new ArrayList<Integer>();
				//on peut ajouter des éléments un par un
				maListeNombres.add(4);
				maListeNombres.add(35);
				maListeNombres.add(42);
				maListeNombres.add(25);
				//ArrayList ayant un toString intégré, on peut afficher directement la variable
				System.out.println(maListeNombres);
				
				//je peux trier la liste selon un ordre précis
				//ici, par ordre croissant
				maListeNombres.sort(Comparator.naturalOrder());
				//autre syntaxe possible
				//attention : le tri automatique n'est possible que sur des éléments simples (nombres, caractères...)
				Collections.sort(maListeNombres);
				System.out.println(maListeNombres);
				
				//portée des variables : toujours initialiser en dehors de la boucle quand on veut s'en resservir sur tous les tours !
				//liste d'Objets, accepte n'importe quel type de données Java ou presque
				ArrayList<Object> listeBoucle = new ArrayList<Object>();
				for(int i = 0; i < 5 ; i++) {
					Scanner scanNb = new Scanner(System.in);
					System.out.println("entrez un nombre");
					int nbEntree = scanNb.nextInt();
					//fonctionne aussi bien dans la boucle que dehors
					listeBoucle.add(nbEntree);
					listeBoucle.add("test"); //cette liste accepte n'importe quel type d'éléments : peu prudent
					System.out.println(listeBoucle);
				}
				//je peux ajouter un groupe entier d'éléments à la fois
				listeBoucle.addAll(maListeNombres);
				System.out.println(listeBoucle);
				
				//je peux chercher des choses dans la liste
				System.out.println(listeBoucle.contains("test"));
				System.out.println(listeBoucle.lastIndexOf("test"));
				//je peux récupérer la valeur de l'élément qui se trouve à une certaine position
				System.out.println(listeBoucle.get(11));
				
				//je peux changer la valeur d'une position
				listeBoucle.set(4, "nouvelle valeur");
				
				//je peux supprimer l'élément qui se trouve à une certaine position
				listeBoucle.remove(11);
				System.out.println(listeBoucle);		
				
				//je peux vider la liste
				listeBoucle.clear();
				System.out.println(listeBoucle);
				
				
			}

		}
		
	}

}
