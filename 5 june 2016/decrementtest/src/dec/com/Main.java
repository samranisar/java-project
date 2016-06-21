package dec.com;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        int i=3; //2 1 0 -1
        System.out.println("i value "+i);
        int j= i-- + 2; //5 4 3
        System.out.println("j result: "+j); //5
        int k = --j - i--; //2 1
        System.out.println("k result: "+k); //2
        int l= k-- - --j + i-- + --i; //-1
        System.out.println("l result: "+l); //-1


    }

}