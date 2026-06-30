import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String day = in.next().trim().toLowerCase();
        System.out.print("Enter age: ");
        int age = in.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
            return;
        }

        int price;
        if (age < 18) {
            if (day.equals("wednesday")) {
                price = 6;
            } else {
                price = 8;
            }
        } else {
            if (day.equals("wednesday")) {
                price = 8;
            } else {
                price = 10;
            }
        }

        System.out.println("Ticket price: $" + price);
    }
}
