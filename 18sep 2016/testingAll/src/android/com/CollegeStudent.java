package android.com;

/**
 * Created by Samra on 20-Sep-16.
 */
public class CollegeStudent extends Student
{
    private String major;
    private int year;

    CollegeStudent(String myName,int myAge,String myGender,int myIdNum,float myGPA,int year,String major)
    {
        super(myName,myAge,myGender,myIdNum,myGPA);
        this.year=year;
        this.major=major;
    }

    public String toString()
    {
        return super.toString()+ " Major = "+this.major+ " Year = "+this.year;
    }

}
