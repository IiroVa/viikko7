package main;
import java.util.ArrayList;

public class Gifu {
    ArrayList <Course> courses = new ArrayList<>();
    private String University;

    public Gifu(String university){
        this.University=university;


    }

    public void addCourse(Course course){
        courses.add(course);

    }

    public void gerCourse(){

    }

    public void gerCourses(){

    }
    public void listCourses(){
        int i=0;

        for(Course course : courses ){
            
            System.out.println(i + ") " + course.getId() + " " + course.getName());
            i++;
        }
            
    }
    public void addStudent(){

    }

    public void getStudent(){

    }

    public void listStudents(){

    }
    public void enrollStudent(){

    }

    public void getEnrollments(){

    }
  


    
    
}


