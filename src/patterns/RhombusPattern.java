package patterns;

/*
 * * * * *
 *  * * * *
 *   * * * *
 *    * * * *
 *     * * * * 
 *      * * * *
 */

public class RhombusPattern {

	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i<=n+2; i++) {
			// leading spaces
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			
			//n times stars
			for(int j = 1; j<=n; j++) {
				System.out.print("*");
				if(j < n){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
