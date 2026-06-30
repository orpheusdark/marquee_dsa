/******************************************************************************

COUNT OF EVEN NUMBERS BETWEEN 100 AND 1000 USING WHILE LOOP

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;

        while (num <= 1000) {
            if (num % 2 == 0) {
                count++;
            }
            num++;
        }

        System.out.println(count);
    }
}
