package android.com;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random a = new Random();
        int b,c,d,e,swap;
        int arr[]= new int[5];
        System.out.println("Unsorted Array");
        for(b=0 ; b < arr.length ; b++)
        {
            int i = a.nextInt(20);
            arr[b] =i;
            System.out.println("arr"+"["+b+"] = "+i );
        }

        for(c= 0;c < arr.length ;c++)
        {
            for(d=0 ; d < arr.length-1 ;d++)
            {
                if(arr[d] > arr[d+1])
                {
                    swap       = arr[d];
                    arr[d]   = arr[d+1];
                    arr[d+1] = swap;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array");
        for(e=0;e<arr.length;e++)
        {
            System.out.println("arr"+"["+e+"] = "+arr[e]);
        }

    }
}
