package cz.vutbr.feec.cisla;

import cv2_5.Board;
//import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class P05TreeSetDemo{
	final static int NAHORU = 1;
	final static int DOLU = 2;

	public static void main(String[] args) {
		HraciPole g1 = new HraciPole();

		// Vytvor mnozinu a pridej
		TreeSet<HraciPole> set = new TreeSet<HraciPole>();
		set.add(g1);

		// Pridej do mnoziny
		HraciPole g2 = g1.klonujAPohni(NAHORU);
		g2.pohni(DOLU);
		set.add(g2);

		System.out.println("Pocet prvku v mnozine je: "+set.size() + "\n"+ set);


		System.out.println(g1.equals(g2));


	}

}
