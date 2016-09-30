package android.com;

/**
 * Created by Samra on 29-Sep-16.
 */
public class Student {

    private String S_name;
    private int S_roll_no;
    private String S_address;
    private double S_GPA;


    Student(String S_name,int S_roll_no,String S_address,double S_GPA)
    {
        this.S_name= S_name;
        this.S_roll_no=S_roll_no;
        this.S_address=S_address;
        this.S_GPA= S_GPA;

    }
    public String getS_name()
    {
        return this.S_name;
    }
    public int getS_roll_no()
    {
        return this.S_roll_no;
    }
    public String getS_address()
    {
        return this.S_address;
    }
    public double getS_GPA()
    {
        return this.S_GPA;
    }
}
