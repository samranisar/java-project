package android.com;

import java.util.Random;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Car c = new Car("Car",5);
        Truck t = new Truck("Truck",4,50);
        Bus b = new Bus("Bus",25);
        SchoolBus sb = new SchoolBus("School bus",30);

        Vehicle v[] = new Vehicle[4];
        v[0] = c;
        v[1] = t;
        v[2] = b;
        v[3] = sb;

        Random r = new Random();
        int random = r.nextInt(v.length);
        v[random].getVehicleDetails(v[random]);

        }




    }

