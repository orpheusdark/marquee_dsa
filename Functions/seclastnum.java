import java.util.*;

class Main {

    
    
    static boolean secLastNum(int n)
    {
        int a = n/10;
        int b = a%10;
        if (b == 0) {
        return true;
        }
        else {
            return false;
        }
        
    }
    
  ============================================== 


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(secLastNum(n)); 
    }
}