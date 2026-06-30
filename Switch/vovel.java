import java.util.Scanner;

public class vovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        char c = Character.toLowerCase(ch);
        String result;
        switch (c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                result = "Vowel";
                break;
            default:
                if (Character.isLetter(ch)) result = "Consonant";
                else if (Character.isDigit(ch)) result = "Digit";
                else result = "Special character";
                break;
        }

        System.out.println(result);
    }
}

