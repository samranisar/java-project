package android.com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        int input = r.nextInt(26)+65;
        char c = (char)input;

        switch (c)
        {
            case 'A':
                System.out.println("a is a vowel");
                break;
            case 'E':
                System.out.println("e is a vowel");
                break;
            case 'I':
                System.out.println("i is a vowel");
                break;
            case 'O':
                System.out.println("o is a vowel");
                break;
            case 'U':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println(c+" is not a vowel");
        }
    }
}
