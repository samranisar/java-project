package guess.com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random a = new Random();
        int answer = a.nextInt(10) + 1;
        boolean iscontinue = false;
        int x = 1;
        System.out.println("Enter a number from 1-10");
        do
        {
            Scanner b = new Scanner(System.in);
            int input = b.nextInt();
            if (input == answer)
            {
                System.out.println("your guess is correct");
                break;
            }

            else
            {
                if(x>2)
                {
                    System.out.println("Oops,sorry wrong guess");
                    break;
                }
                System.out.println("Try Again");
                System.out.println("Do You Want To Continue");
                String c = b.next();
                if (c.equals("y"))
                {
                    iscontinue = true;
                    System.out.println("guess the number");
                    x++;

                }
            }
        }
            while (iscontinue);

    }
}