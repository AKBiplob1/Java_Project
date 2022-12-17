package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    String user, pass;
    Scanner in = new Scanner(System.in);

    public void pass_check() {
        System.out.print("User Name :");
        user = in.next();
        System.out.print("Password :");
        pass = in.next();
        if (user.equals("Asif") && pass.equals("4604")) {
            view();
        } else
            System.out.println("Invalid Username or Password");
        System.out.println("Enter Pasword Again...");
        pass_check();
    }

    public void view() {
        System.out.println("Enter number of new students to enroll:");
        int numofStudents = in.nextInt();
        Student[] students = new Student[numofStudents];

        for (int n = 0; n < numofStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
        for (int n = 0; n < numofStudents; n++) {
            System.out.println(students[n].toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to our DIU");
        StudentDatabaseApp obj = new StudentDatabaseApp();
        obj.pass_check();
    }
}
