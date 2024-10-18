package patterns;

/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 */

public class ZeroOneTriangle {

	public static void main(String[] args) {
		
		for(int i =1; i<=4; i++) {
			int count = i;
			// or else use (i+j) % 2 != 0 to reduce the space
			for(int j = 1; j<=i; j++) {
				if(count % 2 != 0)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
				count++;
			}
			System.out.println();
		}
	}

}
