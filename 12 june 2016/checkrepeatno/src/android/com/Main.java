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
        int i, j;
        int arr[] = new int[5];
        for (i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(10);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
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
        }
        /*for(i=0;i<arr.length;i++) {

            if (i == 0) {
                arr[i] = a.nextInt(10);
            } else {
                for (j = 0; j < arr.length; j++)
                    if (n > i || n < 0) {
                        break;
                    }
                if (arr[i] == arr[n-i]) {
                    arr[i] = a.nextInt(10);
                    if (arr[i] != arr[i - n]) {
                        n++;
                    } else {
                        arr[i] = a.nextInt(10);
                    }
                }
            }
        }*/

            /*if (i == 0)
            {
                arr[i] = a.nextInt(10);
            }
            else {
                arr[i] = a.nextInt(10);
                inner:
                for (int j = i - 1; j < arr.length; j--) {
                    if (j > i|| j<0)
                    {
                        break inner;
                    }
                    else if (arr[i] == arr[j])
                    {
                        arr[i] = a.nextInt(10);
                    }

                }
            }
        }
        for(int k=0;k<arr.length;k++)
            System.out.println("arr["+k+"] = "+arr[k]);*/

    }

    }
