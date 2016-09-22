package android.com;

/**
 * Created by Samra on 22-Sep-16.
 */
public class Distance {
    private double distIn_Km;
    private int distIn_m;


    public boolean Equals(Object other) {
        if (other == this)
            return true;
        else if(other==null)
            return false;
        else if (getClass() != other.getClass())
            return false;
        Distance distance = (Distance) other;
        return (distIn_Km == distance.distIn_Km && distIn_m== distance.distIn_m);


    }

    public String detail(double distIn_Km,int distIn_m)
    {
        this.distIn_m=distIn_m;
        this.distIn_Km=distIn_Km;
        return distIn_Km+" km "+distIn_m+" m";



    }
}
