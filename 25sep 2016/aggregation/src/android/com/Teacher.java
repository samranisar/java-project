package android.com;

/**
 * Created by Samra on 29-Sep-16.
 */
public class Teacher {

    String T_name;
    String T_address;
    int T_telephone_no;
    String T_degree;

    Teacher(String T_name,String T_address,int T_telephone_no,String T_degree)
    {
        this.T_name=T_name;
        this.T_address=T_address;
        this.T_telephone_no=T_telephone_no;
        this.T_degree=T_degree;
    }

    public String getT_name()
    {
        return this.T_name=T_name;
    }
    public String getT_address()
    {
        return this.T_address=T_address;
    }
    public int getT_telephone_no()
    {
        return this.T_telephone_no=T_telephone_no;
    }
    public String getT_degree()
    {
        return this.T_degree=T_degree;
    }
}
