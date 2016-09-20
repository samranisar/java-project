package android.com;

/**
 * Created by Samra on 21-Sep-16.
 */
public class BankAccount {

    private int balance=60000;
    private String Name;
    private int Age;
    private String Email;
    private String Dob;

    public int deposit(){
        int deposit=5000;
        return deposit;
    }

    public int withdraw(){
        int withdrawalAmount=20000;
        balance=balance-withdrawalAmount;
        return balance;


    }
    public int display(){
        return withdraw() ;

    }
    public String getName()
    {
     return this.Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getAge()
    {
        return this.Age;
    }
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public void setEmail(String Email)
    {
        this.Email=Email;
    }
    public String getDob()
    {
        return this.Dob;
    }
    public void setDob(String Dob)
    {
        this.Dob=Dob;
    }
}
