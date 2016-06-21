package star.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int row,col,w,x,z,y;
        for(row = 1;row <=4; row++)
        {
            if(row==1)
            {
                for (w = 1; w<= 6; w++)
                {
                    System.out.print("*");

                }
            }
            else if(row==2)
            {
                for(x=1;x<=4;x++)
                {
                    System.out.print("*");
                }
            }
            else if(row==3)
            {
                System.out.print(" ");
                for(y=1;y<=2;y++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("  ");
                for (z = 1; z <= 1; z++)
                {
                    System.out.print("*");
                }
            }
                System.out.println();
            System.out.print(" ");

        }
            }
}
