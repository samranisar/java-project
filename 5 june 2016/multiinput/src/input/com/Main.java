package input.com;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {

	// write your code here
        int choice;
        choice = System.in.read();
        System.out.println(choice + " for single char input");
        Scanner a =new Scanner(System.in);
        int input = a.nextInt();
        System.out.println(input + " for multi integer input");

    }
}
