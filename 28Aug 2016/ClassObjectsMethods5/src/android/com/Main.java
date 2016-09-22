package android.com;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calculate j = new Calculate();
        Calculate k = new Calculate();
        System.out.println(j.Add(6,4));
        System.out.println(j.Add(5.5,7.5));
        System.out.println(j.Add('8','9'));
        System.out.println(k.Subtract(6,4));
        System.out.println(k.Subtract(7.5,5.5));
        System.out.println(k.Subtract('c','9'));



    }
}
