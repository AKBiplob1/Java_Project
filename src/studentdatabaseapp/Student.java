package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses ;
    private int tutionBalance =0;
    private int costOfCourse=3000;
    private static int id=100;
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Student First Name:");
        this.firstName=in.nextLine();
        System.out.println("Enter Student Last Name:");
        this.lastName=in.nextLine();
        System.out.println("1 - Freshmen\n2 - Shopmore\n3 - Junior\n4 - Senior\nEnter Student Class Level:");
        this.gradeYear=in.nextLine();
        setStudentID();



    }
    // Constructor:prompt user to enter students name and year
    // generate an id

    private void setStudentID(){
        id++;
        this.studentID=gradeYear + "" + id;

    }
    //Enroll in course
    public void enroll(){
     do{
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner in =new Scanner(System.in);
        String course=in.nextLine();
        if(!course.equalsIgnoreCase("Q")){
            courses=courses + "\n  " + course;
            tutionBalance=tutionBalance + costOfCourse;
        }
      else {

            break;
        }
        } while(1 !=0);


    }
    //view blance
    public void viewBalance(){
        System.out.println("Your balance is:" + tutionBalance + "tk");
    }

    //pay tution
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment:Tk ");
        Scanner in=new Scanner(System.in);
        int payment= in.nextInt();
        tutionBalance=tutionBalance-payment;
        System.out.println("Thank you for your payment of:" + payment + "tk");
        viewBalance();
    }
    // show status
    public String toString (){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +

                "\nCourses  Enrolled:" + courses+
                "\nBalance: tk" + tutionBalance;

    }
}
