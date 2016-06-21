package android.com;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char c='a';
        switch (c)
        {
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;
            case 'i':
                System.out.println("i is a vowel");
                break;
            case 'o':
                System.out.println("o is a vowel");
                break;
            case 'u':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println(c+" is not a vowel");
        }
    }
}
