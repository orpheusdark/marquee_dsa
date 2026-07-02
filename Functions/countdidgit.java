import java.util.*;

class Solution {

    static int countDigits(int n)
    {
        if (n / 10 == 0)
            return 1;

        return 1 + countDigits(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countDigits(n)); 
    }
}

// https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1