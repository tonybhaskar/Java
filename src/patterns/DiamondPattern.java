package patterns;

/*
 *    *
 *   * *
 *  * * *
 * * * * *
 *  * * *
 *   * *
 *    *
 */

public class DiamondPattern {

	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i<=n; i++) {
			//Leading spaces
			for(int j = n-i; j>=1; j--) {
				System.out.print(" ");
			}
			//print stars
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
	}

}
