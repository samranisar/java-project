package android.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner a =new Scanner(System.in);
        int arrsize = a.nextInt();
        int arr[]=new int[arrsize];
        String primeno = "";
        for(int i=0;i<=arr.length-1;)
        {
            middle:
            for(int x=1;x>=1;x++)
            {
                int counter = 0;
                for (int j = x; j >= 1; j--) {
                    if (x % j == 0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    arr[i] = x;
                    System.out.println("arr[" +i+"] = "+x);
                    i++;
                }
                if(i==arrsize)
                {
                    break middle;
                }
            }
        }



    }
}
