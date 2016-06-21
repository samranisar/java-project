package inc.com;

public class Main {
    class Incrementtest
    {

    public static void main(String[] args)
    {
        // write your code here
        int num1 = 10; //10 12 13 14 15
        int num2 = 20; //21 22
        System.out.println("post increment of num1 " + num1++); //10
        System.out.println("preincrement of num2 " + ++num1); //12
        int num3 = num1++ + ++num2; //33 34
        System.out.println(" num1++ + ++num2= " + num3); //33
        int num4 = num3++ + ++num1 + num2++; //68 69 70
        System.out.println("num4 result= " + num4); //68
        num2 = num2 + 2; //24 25
        System.out.println("num2 result= " + num2); //24
        int num5 = num4++ + ++num4 + ++num1 + num2++; //177
        System.out.println("num5 result= " + num5); //177
        num4 = num5 + 4; //181
        System.out.println("num4 result= " + num4); //181
    }
    }
}