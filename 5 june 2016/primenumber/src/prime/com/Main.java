package prime.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i, j;
        boolean isPrime;
        for (i=2; i < 100 ; i++) {
            isPrime = true;

            for (j = 2; j <= i / j; j++)
            { if ((i % j) == 0) isPrime = false;}

            if (isPrime)
                System.out.println(i + " Is a prime number");
        }

        }
}
