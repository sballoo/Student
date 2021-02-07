/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author shai Jan 2021
 */
public class PartTimeStudent extends Student{
//this is done
    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }
    
    private int numCourses;

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
