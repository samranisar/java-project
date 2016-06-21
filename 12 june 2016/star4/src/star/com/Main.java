package star.com;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int nofrows;
        System.out.println("enter no. of rows");
        nofrows=s.nextInt();
        int rows,colspc,colstar;
        for(rows= 1;rows<=nofrows;rows++)
        {
            for(colspc=nofrows-rows;colspc>=1;colspc--)
            {
                System.out.print(" ");
            }
            for(colstar=1;colstar<=(rows*2)-1;colstar++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
