package android.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s="Hello Programming";
        System.out.println(s);
        Scanner a= new Scanner(System.in);
        char b = a.next(".").charAt(0);
        int c= s.indexOf(b);
        int count=0;
        outer:
        for(int x=0;x<s.length();x++)
        {
            if(c==-1)
            {
                break outer;
            }
            else
            {
                System.out.println("index of "+b+" = "+c);
                count = count + 1;
                c = s.indexOf(b, c + 1);
            }

        }
        System.out.println("Number of "+b+" present in a string = "+count);
    }
}
