package android.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student[]=new Student[5];
        Teacher teacher=new Teacher("Mahira"," g block acd street",5698890,"BBA-MBA");

        student[0]=new Student("Samra",27,"123 street",3.6);
        student[1]=new Student("Ammar",12,"abc street",3.0);
        student[2]=new Student("Saira",23,"345 street",3.3);
        student[3]=new Student("Kaira",45,"ret street",3.1);
        student[4]=new Student("Aamaal",32,"654 street",3.7);


        Course c=new Course(student,teacher);
        c.setC_name("ENGINEERING");
        c.PrintDetails();

    }
}
