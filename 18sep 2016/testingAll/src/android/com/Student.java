package android.com;

/**
 * Created by Samra on 20-Sep-16.
 */
public class Student {
    private String myName;
    private int myAge;
    private String myGender;
    private int myIdNum;
    private float myGPA;

    Student(String myName,int myAge,String myGender,int myIdNum,float myGPA)
    {
        this.myName=myName;
        this.myAge=myAge;
        this.myGender=myGender;
        this.myIdNum=myIdNum;
        this.myGPA=myGPA;
    }

    public String toString()
    {
        return "myName = "+this.myName+" myAge = "+this.myAge+" myGender = "+this.myGender+" myIdNum = "+this.myIdNum+" myGPA = "+this.myGPA;
    }
}
