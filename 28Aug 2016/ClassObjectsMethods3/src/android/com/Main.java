package android.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Point p = new Point(5, 3);
        Point q = new Point(5, 10);
        Point r =new Point();


        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println("(" + p.getX() + "," + p.getY() + ")");

        System.out.println(q.getX());
        System.out.println(q.getY());
        System.out.println("(" + q.getX() + "," + q.getY() + ")");

        String e= r.Equality(p.getX(),p.getY(),q.getX(),q.getY());
        System.out.println(e);
    }



}

