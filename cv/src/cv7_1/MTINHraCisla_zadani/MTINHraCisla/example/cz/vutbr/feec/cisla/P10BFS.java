package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HashSet<HraciPole> hash = new HashSet<>();
		HraciPole tmp = null;
		HraciPole g = new HraciPole();
		// TODO: vytvorit nahodne hraci pole (viz priklad P2Randomize)
		BFS bfs = new BFS();

		//randomize
		Random rnd = new Random();
		for (int i = 0; i < 100000; i++) {
			int nahodne = rnd.nextInt(4);
			g.pohni(1 + nahodne);
		}
		System.out.println(g);

		//fronta
		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		fronta.add(g);

		if(fronta.isEmpty()||fronta.size()==0){System.out.println("Riesenie neexistuje");}
		else {
			tmp = fronta.get(0);
			fronta.remove(0);
		}







//		bfs.vypisTahy(h);
		
	}
}
