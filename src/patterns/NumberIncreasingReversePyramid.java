package patterns;

/*
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
