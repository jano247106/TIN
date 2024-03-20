package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;

public class BFS2 {
	public void vypisTahy(HraciPole zadani) {
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		HraciPole tmp = null;
		HraciPole g = new HraciPole();



		//fronta
		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		fronta.add(g);

		if(fronta.isEmpty()||fronta.size()==0){System.out.println("Riesenie neexistuje");}
		else {
			tmp = fronta.get(0);
			fronta.remove(0);
		}




	}
}
