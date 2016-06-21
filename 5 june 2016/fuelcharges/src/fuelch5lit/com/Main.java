package fuelch5lit.com;

public class Main { /*Create a program that will print fuel charges of 5 litres .
    Assign variable int fuelPerLitre = 100*/


    public static void main(String[] args) {
	// write your code here
        int fuelPerLitre=100;
        if(fuelPerLitre >=100 && fuelPerLitre<=150)
        {
            System.out.println("Your fuel charges for 5litres will be in between Rs. 500 and Rs. 750");
        }
        else if(fuelPerLitre>= 90 && fuelPerLitre<=100)
        {
            System.out.println("Your fuel charges for 5litres will be in between Rs. 450 and Rs. 500");
        }
        else
        {
            System.out.println("your fuel charges have not been decided yet");
        }
    }
}
