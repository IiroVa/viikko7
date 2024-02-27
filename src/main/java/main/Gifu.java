package main;
import java.util.ArrayList;

public class Gifu {
    ArrayList <Course> courses = new ArrayList<>();
    ArrayList <Student> students = new ArrayList<>();
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
    public void addStudent(Student st){
        students.add(st);
    }

    public void getStudent(){

    }

    public void listStudents(){
        int i=0;

        for(Student st : students ){
            
            System.out.println(i + ") " + st.getId() + " " + st.getName());
            i++;
        }
    }
    public void enrollStudent(){

    }

    public void getEnrollments(){

    }
  


    
    
}


