import com.sun.jdi.PathSearchingVirtualMachine;
//Create a Class name as Student which contains the Values or you can say main values  of a particular student
class Student {

    // In this it has IMP value assigned such as Roll no , Gender , Name , Email id , [ which we will use in the future , and why we created this because we can easily provide Values for multiple Students and these values are not same , in short we dont have to  create a new class for a each student]
        int  roll_no ;
        char gender;
        String name ;
        String Email_id;

// The "this" keyword is used to refer to the current object of a class. It helps avoid confusion when a variable inside a method or constructor has the same name as the instance variable of the class.
    public Student(int roll_no, char gender, String name, String email_id) {
        this.roll_no = roll_no;
        this.gender = gender;
        this.name = name;
        Email_id = email_id;
    }
//
    public Student() {

    }


}
// in the main class we have all the data of the student assigned properly and did sout it
public class Day0 {
    public static void main(String[] args) {
        System.out.println("Stdent Data ");
        Student S1 = new Student();
        S1.roll_no = 12;
        S1.name ="Shreyas";
        S1.Email_id="shreyasnepale07@gmail.com";
        S1.gender='M';

        System.out.println("Stuednt Roll no is : "+S1.roll_no);
        System.out.println("Student Name is : " + S1.name);
        System.out.println("Student Email id is : " + S1.Email_id);
        System.out.println("Student Gender is : " + S1.gender);


        Student S2 = new Student(20,'M',"xyz","xyz@gmail.com");
        System.out.println("Default student");

    }

}
