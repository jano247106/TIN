package cz.vutbr.feec.cisla;

import javax.print.attribute.standard.MediaSize;
import java.util.HashSet;

public class P06HashSetDemo {
	final static int NAHORU = 1;
	final static int DOLU = 2;
	
	public static void main(String[] args) {
		HraciPole g1 = new HraciPole();

		// Vytvor mnozinu a pridej
		HashSet<HraciPole> set = new HashSet<HraciPole>();
		set.add(g1);
		
		// Pridej do mnoziny
		HraciPole g2 = g1.klonujAPohni(NAHORU);
		g2.pohni(DOLU);
		g2.pohni(NAHORU);
		g2.pohni(DOLU);
		set.add(g2);
		System.out.println("Pocet prvku v mnozine je: "+set.size() + "\n"+ set);

		System.out.println(g1.equals(g2));
		System.out.println(g1.hashCode()==(g2.hashCode()));
	}
}
