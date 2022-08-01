package exempleFonction;

import java.util.Scanner;

public class fonctionSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exemple d'utilisation de la condition switch
		int key = 0;
		
		switch (key)	{
		case 0:
			System.out.println("ma clé vaut 0");
			break;
		case 1:
			System.out.println("ma clé vaut 1");
			break;
			
		default :
			System.out.println("ma clé vaut autre chose");
			break;
		}
		
		// ex de MENU :
		System.out.println("Bienvenue");
		System.out.println("1Que desirez vous");
		System.out.println("2(M)orpion");
		System.out.println("3(P)endu");
		System.out.println("4(Q)uitter");
		String reponse;
		Scanner sc = new Scanner(System.in);
		do {
			reponse = sc.nextLine();
			switch(reponse)	{
			case "M":
			case "1" :
				System.out.println("On exécute la fonction morpion");
				break;
			case "P":
			case "2":
				System.out.println("On exécute la fonction pendu");
				break;
			case "Q":
			case "3":
				System.out.println("On stoppe l'application");
				break;
			default :
				System.out.println("entrez M, P ou Q");
				
			}
			
		}while(!reponse.equals("Q") && !reponse.equals("3"));
		
	}

}
