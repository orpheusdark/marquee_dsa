/******************************************************************************

COUNT OF DIGITS IN A NUMBER USING WHILE LOOP AND REVERSE THE NUMBER.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        int reverse = 0;
        int temp2 = number;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        while (temp2 != 0) {
            int digit = temp2 % 10;
            reverse = reverse * 10 + digit;
            temp2 = temp2 / 10;
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}
