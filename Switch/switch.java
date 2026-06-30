// Date-29-06-2026

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month number (1 - 12): ");
		int month = scanner.nextInt();
		int days;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			System.out.println(days);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
						System.out.println(days);

			break;
		case 2:
			days = 28;
						System.out.println(days);

			break;
		default:
			days = 0;
						System.out.println(days);

		}

		scanner.close();
	}
}