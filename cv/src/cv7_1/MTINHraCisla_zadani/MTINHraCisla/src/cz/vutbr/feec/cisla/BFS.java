package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole zadani) {
		int[][] reseni = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};

		// TIP: Vyzkousejte s ruznyma strukturama
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		// TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		// LinkedList<HraciPole> closed = new LinkedList<HraciPole>();


		//fronta
		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		fronta.add(zadani);

		while (!fronta.isEmpty()){
			HraciPole tmp = new HraciPole();
			tmp = fronta.removeFirst();
			if(fronta.isEmpty()){
				System.out.println("Riesenie nenajdene");
				return;
			}
			if(tmp.jeReseni()){
					System.out.println("Riesenie najdene.");
					System.out.println(tmp);
					return;
				}
			closed.add(tmp);

			for(int i=0; i<4; i++){
				HraciPole hp = new HraciPole();
				hp = tmp.klonujAPohni(i+1);
				if(hp != null && !fronta.contains(hp) && !closed.contains(hp)){
					fronta.add(hp);
				}
			}
		}

	}
}
