package android.com;

/**
 * Created by Samra on 30-Sep-16.
 */
public class Truck extends Vehicle {

    int cargoCapacity;

    Truck(String catagory,int capacity,int cargoCapacity)
    {
        super(catagory,capacity);
        this.cargoCapacity=cargoCapacity;
    }

    public String getCatagory()
    {
        return this.catagory;
    }
    public int getCapacity()
    {
        return this.capacity;
    }
    public int getCargoCapacity()
    {
        return this.cargoCapacity;
    }


    public void getDetails(){

        System.out.println("catagory:"+this.getCatagory()+" passengercapacity:"+this.getCapacity()+" cargoLoadingCapacity:"+this.getCargoCapacity()+" tons");
    }
}
