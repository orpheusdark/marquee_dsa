/******************************************************************************

                                  Hollow Rectangle with Diagonals

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scn = new Scanner(System.in);
// 		int row = scn.nextInt();
// 		int col = scn.nextInt();
int n = 10;
		for (int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		     if (i == 0 || j == 0 || j == n - 1 || i == n - 1 || i+j == n-1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		    }
		    System.out.println();
		}
	}
}