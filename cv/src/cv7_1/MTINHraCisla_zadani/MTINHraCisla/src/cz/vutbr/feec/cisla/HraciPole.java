//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cz.vutbr.feec.cisla;

import java.util.ArrayList;
import java.util.Arrays;

public class HraciPole implements Comparable<HraciPole> {
	private int[][] data = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
	private int x = 2;
	private int y = 2;
	private ArrayList<Integer> pohyby = new ArrayList();
	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public boolean jeReseni() {
		int[][] reseni = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
		for (int x = 0; x < reseni.length; x++) {
			for (int y = 0; y < reseni[0].length; y++) {
				if (data[x][y] != reseni[x][y]) {
					return false;
				}
			}
		}
		return true;
	}

	public HraciPole klonujAPohni(int smer) {
		HraciPole nove = new HraciPole();
		nove.x = this.x;
		nove.y = this.y;
		nove.pohyby.addAll(this.pohyby);
		nove.pohyby.add(smer);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				nove.data[x][y] = this.data[x][y];
			}
		}

		boolean jeMozny = nove.pohni(smer);
		if (jeMozny) {
			return nove;
		} else {
			return null;
		}
	}

	public boolean pohni(int smer) {
		switch (smer) {
			case UP:
				// nahoru
				if (y < 1) {
					return false;
				}
				data[x][y] = data[x][y - 1];
				data[x][y - 1] = -1;
				y = y - 1; // y--;
				return true;
			case DOWN:
				// nahoru
				if (y > 1) {
					return false;
				}
				data[x][y] = data[x][y + 1];
				data[x][y + 1] = -1;
				y++; // y = y + 1;
				return true;
			case LEFT:
				// nahoru
				if (x < 1) {
					return false;
				}
				data[x][y] = data[x - 1][y];
				data[x - 1][y] = -1;
				x = x - 1; // y--;
				return true;
			case RIGHT:
				if (x > 1) {
					return false;
				}
				data[x][y] = data[x + 1][y];
				data[x + 1][y] = -1;
				x++; // y = y + 1;
				return true;// TODO
		}
		return false;
	}


	@Override
	public String toString() {
		String res = "pohyby:" + pohyby + "\n";
		for (int iy = 0; iy < 3; iy++) {
			for (int ix = 0; ix < 3; ix++) {
				res += data[ix][iy] + ",";
			}
			res += "\n";
		}
		return res;
	}




	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		HraciPole hraciPole = (HraciPole) object;
		return Arrays.deepEquals(data, hraciPole.data);
	}

	@Override
	public int hashCode() {
		return Arrays.deepHashCode(data);
	}

	@Override
	public int compareTo(HraciPole o) {
		int[][] solution = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.data[i][j] != o.data[i][j]) {
					return this.data[i][j] - solution[i][j];
				}
			}
		}
		return 0;
	}

}