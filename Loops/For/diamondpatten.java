/******************************************************************************

                           DIAMOND PATTERN

*******************************************************************************/

public class Main {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0; i<n; i++) {
			for(int s=0; s<n-i-1; s++) {          // s = 0 < (5-0-1) = 4
			                                      
				System.out.print(" ");           
			}                                    
			 int in= 1;                   
			for(int j=0; j<=i; j++) {
				System.out.print (in + j);
			}

			for (int j = i - 1; j >= 0; j--) {
				System.out.print (in + j);
			}
			System.out.println();
		}

	}
}
