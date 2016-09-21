package android.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Math a=new Math();
        int x= a.min(7,3);
        System.out.println(x);
        int y=a.max(6,10);
        System.out.println(y);
        int z=a.abs(-4);
        System.out.println(z);
        double c=a.ceil(4.9);
        System.out.println((int)(c));


    }
}
