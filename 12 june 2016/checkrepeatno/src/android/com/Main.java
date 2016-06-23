package android.com;

import java.util.Random;
//object:generate a random numbers array with no repeating numbers
//problem: checking each no. forward but not checking backward numbers
//good for forward checking but not good for backward checking of numbers
//logic for backward checking missing

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random a = new Random();
        int integer, count;
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            do {
                arr[i] = a.nextInt(10);
                count = 0;//for checking previous array elements
                while (arr[i] != arr[count]) {
                    count++;

                }
            }
            while (i != count);
            System.out.println(arr[i]);
        }
    }
}
       /* int i, j;
        int arr[] = new int[5];
        for (i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(10);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (j = 0; j < arr.length; j++) {
            for (int k = j+1; k < arr.length; k++) {
                if (arr[j] == arr[k] )
                {
                    arr[k] = a.nextInt(10);
                    inner:
                    for (int b = 0; arr[j]==arr[k]; b++)
                            arr[k] = a.nextInt(10);
                }

            }
        }
        System.out.println("no repetition");
        for(int m=0;m<arr.length;m++)
        {
            System.out.println("arr["+m+"] = "+arr[m]);
        }*/
