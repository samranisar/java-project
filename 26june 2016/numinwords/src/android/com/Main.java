package android.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a[]={"one","two","three","four","five","six","seven","eight","nine"};
        String b[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String c[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
        Scanner x =new Scanner(System.in);
        System.out.println("Enter any no. from 1-100");
        int y = x.nextInt();
        for(int i=0;i<=99;i++)
        {
            if(y>=1 && y<=9)
            {
                System.out.println("In words:"+a[y-1]);
                break;
            }
            else if(y>=11 && y<=19)
            {
                System.out.println("In words:"+b[y-11]);
                break;
            }
            else if(y>=10 && y<=100 && y%10==0)
            {
                System.out.println("In words:"+c[(y/10)-1]);
                break;
            }
            else if(y>=21 && y<=99 && y%10!=0)
            {
                System.out.println("In words:"+c[(y/10)-1]+" "+a[(y%10)-1]);
                break;
            }
            else
            {
                continue;
            }
        }

        }
    }
