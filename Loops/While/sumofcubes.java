/******************************************************************************

SUM OF CUBES OF NATURAL NUMBERS using while loop

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int i = 1;
		int sum = 0;
		while (i <= 4){
		    sum += i * i * i;
		    i++;
		}
		System.out.println(sum);
	}
}
