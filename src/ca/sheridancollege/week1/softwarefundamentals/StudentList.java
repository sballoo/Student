/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

import java.util.Scanner;

/**
 * A class that creates an Array of Students and populates it
 * with 5 students from the current section and then iterates over the
 * list to print each name.
 * @author dancye, Jan 2019
 */

public class StudentList {
    
    public static void main(String[] args)
    {//changed array size to 5
       Student [] studentList = new Student[5];//change size before running
      Scanner input = new Scanner(System.in);
       
       
       //fill in 4 student names before running
       for(int i=0;i<studentList.length;i++)
       {
           System.out.println("Enter the student name: ");
           String name = input.nextLine();
           Student student = new Student(name);
           studentList[i] = student;
       }
       System.out.println("Printing the Students: ");
       String format = "The student's name is %s\n";
        for(Student student: studentList){
            
            System.out.printf(format,student.getName());
        }
    }
    
}
