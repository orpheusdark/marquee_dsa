/******************************************************************************

ARMSTRONG NUMBERS BETWEEN 100 AND 1000 USING WHILE LOOP.

*******************************************************************************/

public class loop5 {
    public static void main(String[] args) {
        int number = 100;
        int count = 0;

        while (number <= 1000) {
            int original = number;
            int sum = 0;
            int i;

            while (original > 0) {
                i = original % 10;
                sum += i * i * i;
                original /= 10;
            }

            if (sum == number) {
                System.out.println(number);
                count++;
            }

            number++;
        }

        System.out.println("Total Armstrong numbers between 100 and 1000: " + count);
    }
}

// HOMEWORK
// 1. Armstrong number in a range
// 2. To check if number is palindrome or not
