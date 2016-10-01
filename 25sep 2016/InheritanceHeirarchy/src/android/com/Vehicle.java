package android.com;

/**
 * Created by Samra on 30-Sep-16.
 */
public class Vehicle {

    public String catagory;
    public int capacity;



    Vehicle(String catagory,int capacity)
    {
        this.catagory=catagory;
        this.capacity=capacity;
    }


    public int getPassengerCapacity(){
        return this.capacity;
    }

    public void getDetails()
    {
        System.out.println("capacity:"+capacity+", catagory:"+catagory);
    }

    public void getVehicleDetails(Vehicle v){

        v.getDetails();
    }

}
