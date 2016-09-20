package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 */
public class Teacher extends Person {
    String subject;
    double salary;



    public Teacher(String myName,int myAge,String myGender,String subject,int salary){
        super();
        this.subject=subject;
        this.salary=salary;
        this.myName=myName;
        this.myAge=myAge;
        this.myGender=myGender;
    }
     public void setSubject(String subject){
         this.subject=subject;
     }

    public String getSubject(){
    return subject;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return super.toString() + "myName ="+myName + " myAge ="+ myAge+" myGender ="+myGender+" subject ="+subject+" salary ="+salary;
    }

}
