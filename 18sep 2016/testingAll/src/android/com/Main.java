package android.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student a =new Student("Samra",23,"F",8204,3.3f);
        System.out.println(a);

        Person b =new Person("Samra",23,"F");
        System.out.println(b);

        Teacher c = new Teacher("Samra",23,"F","Computer Science",60000);
        System.out.println(c);

        CollegeStudent d = new CollegeStudent("Samra",23,"F",8204,3.3f,2,"Communications");
        System.out.println(d);
    }
}
