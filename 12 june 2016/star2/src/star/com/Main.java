package star.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x, y, z;

        for (x = 1; x < 5; x++) {
            for (y = 1; y <= 5 - x; y++)
            {
                System.out.print("*");

            }
            System.out.println(" ");


        }
    }  }