
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex de fonctionnement des exceptions en Java
		// comment on les gère selon le problème ?
		
		// on a les simples erreurs, où on réécrit juste son code
		// int x = toto;
		String chaine = "toto";
		
		// int x = 3/0;
		// System.out.println(x);
		
		int x = Utils.scanInteger("Entrez le dividende");
		int y = Utils.scanInteger("Entrez le diviseur");
		// possibilité de rentrer un zero
		try {
		int res= x/y;
		System.out.println(x + " / "+y+" = "+res);
		} catch (ArithmeticException e)	{
			System.out.println("Pas de zero SVP");
		} catch (Exception e) {
			System.out.println("T'as encore fait une boulette");
		}
		
		
		
	}

}
