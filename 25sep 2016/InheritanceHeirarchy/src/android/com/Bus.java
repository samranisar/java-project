package android.com;

/**
 * Created by Samra on 30-Sep-16.
 */
public class Bus extends Vehicle {

    Bus(String catagory,int capacity)
    {
        super(catagory,capacity);
    }

    public String getCatagory()
    {
        return this.catagory;
    }
    public int getCapacity()
    {
        return this.capacity;
    }

    public void getDetails()
    {
        System.out.println("catagory:"+this.getCatagory()+" capacity:"+this.getCapacity());
    }
}
