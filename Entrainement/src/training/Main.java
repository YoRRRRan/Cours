package training;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nbre = new ArrayList<>();
		
		nbre.add(0);
		nbre.add(5);
		nbre.add(234);
		nbre.add(98);
		nbre.add(521);
		nbre.add(78);
		nbre.add(1);
		nbre.add(9873);
		
		System.out.println(nbre);
		
		Collections.sort(nbre);
		System.out.println(nbre);
	}

}
