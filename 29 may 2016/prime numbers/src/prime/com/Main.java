package prime.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}

        /*for(a=2;a<=30;a++)
        {

                if (a % 2 == 0 && a / 2 == 1)
                {
                    System.out.println(a + " is a prime number");
                }
                if (a % 2 == 0 && a / 2 != 1)
                {
                }
            for(c=2;c<=30;c++)
                if (a % 2 == 1 && a % a == 0 && a % c != 0)
                {
                }
        }*/

