/******************************************************************************

                            Matrix of Stars using Nested For Loop

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		for (int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}