package prime.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,c;

        for(a=2;a<=30;a++)
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
        }







    }
}
