package string.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firststring="This is";
        String secondstring=" a concatenated string";
        String thirdstring= firststring + secondstring;
        String fourthstring= firststring + " " + secondstring + "," + thirdstring;
        System.out.println(thirdstring);
        System.out.println(fourthstring);

    }
}
