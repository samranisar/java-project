package android.com;

/**
 * Created by Samra on 20-Sep-16.
 */
public class CollegeStudent extends Student {

    private String major;
    private int  year;

    CollegeStudent (String myName,int myAge,String myGender,int myIdNum,int myGPA,int year,String major)
    {
        super(myName, myAge,myGender,myIdNum,myGPA);
        this.major=major;
        this.year=year;

    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major=major;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year)
    {
        this.year=year;
    }

    public String toString()
    {
        return super.toString() +  ", Major = "+ this.major+", Year = "+this.year ;
    }

}
