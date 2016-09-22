package android.com;

/**
 * Created by Samra on 22-Sep-16.
 */
public class Point {

    private int x;
    private int y;

    Point(){}

    Point (int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    String Equality(int a,int b,int c ,int d ) {
        if (a == c&& b == d) {
            return "Equal";
        } else {
            return "Not Equal";
        }
    }
}
