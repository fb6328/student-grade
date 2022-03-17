/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentgrade;

import java.util.*;

/**
 *
 * @author kiptim
 */
public class GradeUtils {

    Scanner input = new Scanner(System.in);
    private String name;
    String[] subjects = new String[5];
    int[] marks = new int[5];

    public GradeUtils() {

    }

    private void getName() {
        System.out.println("Please enter Student name: ");
        name = input.nextLine();
    }

    private void getSubjects() {
        System.out.println("Enter the five subjects done by the student: ");
        System.out.println("1:");
        subjects[0] = (input.nextLine());
        System.out.println("2:");
        subjects[1] = (input.nextLine());
        System.out.println("3:");
        subjects[2] = (input.nextLine());
        System.out.println("4:");
        subjects[3] = (input.nextLine());
        System.out.println("5:");
        subjects[4] = (input.nextLine());

    }

    public void getMarks() {

        System.out.println("Enter the marks for each subject: ");
        System.out.println("1 - " + subjects[0]);
        marks[0] = (input.nextInt());
        System.out.println("2 -" + subjects[1]);
        marks[1] = (input.nextInt());
        System.out.println("3 -" + subjects[2]);
        marks[2] = (input.nextInt());
        System.out.println("4- " + subjects[3]);
        marks[3] = (input.nextInt());
        System.out.println("5- " + subjects[4]);
        marks[4] = (input.nextInt());

    }

    public void getGrades(int marks, int x) {

        if (marks >= 0 && marks <= 30) {
            System.out.println(subjects[x] + "= Grade D");

        } else if (marks >= 31 && marks <= 50) {
            System.out.println(subjects[x] + "= Grade C");
        } else if (marks >= 50 && marks <= 75) {
            System.out.println(subjects[x] + "= Grade B");
        } else if (marks >= 75 && marks <= 100) {
            System.out.println(subjects[x] + "= Grade A");
        } else {
            System.out.println(subjects[x] + "= Invalid input please try again");
        }

    }

    public int fetchStudentInformation() {
        getName();
        getSubjects();
        getMarks();
        System.out.println("Student name is " + name);

        for (int x = 0; x < marks.length; x++) {
            getGrades(marks[x], x);

        }
        return 0;
    }

}
