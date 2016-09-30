package android.com;

/**
 * Created by Samra on 29-Sep-16.
 */
public class Course {

    String C_name;
    Student[] stu = new Student[5];
    Teacher teacher;

    Course(Student stu[], Teacher teacher) {
        this.stu = stu;
        this.teacher = teacher;

    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String c_name) {
        C_name = c_name;
    }



    public void PrintDetails()
    {
        System.out.println("Course name :"+ this.C_name);
        System.out.println("Teacher's name :"+this.teacher.getT_name()+ ", Teacher's address :"+this.teacher.getT_address()+ ", Teacher's no. :"+this.teacher.T_telephone_no+", Teacher's degree :"+this.teacher.T_degree );

        for (int a=0;a<stu.length;a++)
        {
            System.out.println("Studemt name :"+this.stu[a].getS_name()+", Student roll_no:"+this.stu[a].getS_roll_no());


        }

    }

}
