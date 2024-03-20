package cz.vutbr.feec.cisla;

import java.util.LinkedList;

public class P07Fronta {
	public static void main(String[] args) {
		HraciPole h1 = new HraciPole();
		HraciPole h2 = new HraciPole();
		HraciPole h3 = new HraciPole();

		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		fronta.addLast(h1);
		fronta.addLast(h2);
		fronta.addLast(h3);

		while (true){
			int i=0;
			HraciPole f = fronta.get(i);
			System.out.println(f);
			fronta.remove(i);
			if(fronta.size()==0) break;
		}
		// TODO: v cyklu postupne odstranit prvky ze zacatku a vypsat je.
		
	}
}
