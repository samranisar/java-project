package android.com;

/**
 * Created by Samra on 20-Sep-16.
 */
public class Teacher extends Person {

    private String subject;
    private int salary;

    Teacher (String myName,int myAge,String myGender,String subject,int salary)
    {
        super(myName, myAge,myGender);
        this.subject=subject;
        this.salary=salary;
    }

    public String getSubject()
    {
        return this.subject;
    }
    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }

    public String toString()
    {
        return super.toString()+ " subject = "+this.subject+" salary = "+this.salary;
    }
}
