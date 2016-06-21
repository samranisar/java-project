package nestboolean.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean doesSignificantWork = false;
        boolean makesBreakthrough = false;
        boolean nobelPrizeCandidate = false;
        if (doesSignificantWork)
        {
            if (makesBreakthrough)
            {
                nobelPrizeCandidate = true;
            }
            else
            {
                nobelPrizeCandidate = false;
            }
        }
        else if (!doesSignificantWork)
        {
            nobelPrizeCandidate = false;
        }
        System.out.println("Print all variables values");
        System.out.println("doesSignificantWork :"+ doesSignificantWork);
        System.out.println("makesBreakthrough:"+ makesBreakthrough);
        System.out.println("nobelPrizeCandidate:"+ nobelPrizeCandidate);


    }
}
