/*
 Program of vowel or consonent by using switch case
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a letter:");
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        s.close();
    }
}