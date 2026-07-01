/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
	public static void main(String[] args) {
		int n = 10;



		for (int i = 0; i < n; i++)

		{
			char ch = 'A';
			for (int j = 0; j < n; j++) {
				if (i<=j)

				{
					System.out.print(ch++);

				}
			}
			System.out.println();
			// ch++;
		}
	}
}
