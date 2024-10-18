package patterns;

/*
 *       1
 *     2 1 2
 *   3 2 1 2 3 
 * 4 3 2 1 2 3 4
 */

public class PalindromTriangular {

	public static void main(String[] args) {
		int n= 4;
		for(int i = 1; i<=n; i++) {
			//leading zeros
			for(int j = n-i; j>=1; j--) {
				System.out.print("  ");
			}
			
			//i to 1
			for(int j = i; j>=1; j--) {
				System.out.print(j+" ");
			}
			
			//2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j );
                if(j<i)
                	System.out.print(" ");
            }
            
			System.out.println();
		}
    }
	

}
