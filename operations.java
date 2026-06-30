import java.util.Scanner;
public class practice27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("add=" + (a + b));
        System.out.println("sub=" + (a - b));
        System.out.println("mul=" + (a * b));
        System.out.println("div=" + (a / b));
        System.out.println("mod=" + (a % b));
        System.out.println("a==b=" + (a == b));
        System.out.println("a!=b=" + (a != b));
        System.out.println("a>b=" + (a > b));
        System.out.println("a<b=" + (a < b));
        System.out.println("a>=b=" + (a >= b));
        System.out.println("a<=b=" + (a <= b));
        System.out.println("and=" + (a & b));
        System.out.println("or=" + (a | b));
        System.out.println("xor=" + (a ^ b));
        System.out.println("notA=" + (~a));
        System.out.println("notB=" + (~b));
        int x = a;
        int y = b;
        System.out.println("a++=" + (x++));
        System.out.println("++a=" + (++x));
        System.out.println("b--=" + (y--));
        System.out.println("--b=" + (--y));
    }
}
