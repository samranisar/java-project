package android.com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        circle c = new circle();
        square s = new square();
        rectangle r = new rectangle();
        Shapes sh[]=new Shapes[10];
        sh[0]=c;
        sh[1]=r;
        sh[2]=s;
        sh[3]=c;
        sh[4]=c;
        sh[5]=s;
        sh[6]=r;
        sh[7]=c;
        sh[8]=r;
        sh[9]=s;

        c.Draw();
        r.Draw();
        s.Draw();
        sh[0].Draw();
    }
}
