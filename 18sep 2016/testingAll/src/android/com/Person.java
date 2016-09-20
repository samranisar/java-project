package android.com;

/**
 * Created by Samra on 20-Sep-16.
 */
public class Person {

    private String myName;
    private int myAge;
    private String myGender;

    Person(String myName,int myAge,String myGender){

        this.myName=myName;
        this.myAge=myAge;
        this.myGender=myGender;
    }

    public String getName()
    {
        return myName;
    }
     public void setName(String myName)
     {
         this.myName= myName;
     }
    public int getAge()
    {
        return myAge;
    }
    public void setAge(int myAge)
    {
        this.myAge=myAge;
    }
    public String getGender()
    {
        return myGender;
    }
    public void setGender(String myGender)
    {
        this.myGender=myGender;
    }

    public String toString()
    {
        return "myName = "+this.myName+" myAge = "+this.myAge+" myGender = "+this.myGender;
    }

}
