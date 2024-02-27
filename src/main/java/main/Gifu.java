package main;
import java.util.ArrayList;

public class Gifu {
    private ArrayList <Course> courses = new ArrayList<>();
    private ArrayList <Student> students = new ArrayList<>();
    private ArrayList <Enrollment> enrollments = new ArrayList<>();
    private String University;

    public Gifu(String university){
        this.University=university;


    }

    public void addCourse(Course course){
        courses.add(course);

    }

    public Course getCourse(int id){
        Course course = courses.get(id);
        return(course);

    }

    public ArrayList<Course> getCourses(){
  

        return(courses);
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

    public Student getStudent(int id){
        Student st = students.get(id);

        return(st);
    }

    public void listStudents(){
        int i=0;

        for(Student st : students ){
            
            System.out.println(i + ") " + st.getId() + " " + st.getName());
            i++;
        }
    }
    public void enrollStudent(Student student, Course course){
        Enrollment enroll = new Enrollment(-1, student, course);
        enrollments.add(enroll);
        
    }


    public ArrayList<Enrollment> getEnrollments(Course course){
        ArrayList <Enrollment> studentss = new ArrayList<>();
        for(Enrollment enroll:enrollments){
            Course cr=enroll.getCourse();
            if(cr==course){
                studentss.add(enroll);
            }
            
        }
        return(studentss);
    }
    public void updateGrades(Student student, Course cr, int arvosana){
        
        for(Enrollment enroll:enrollments){
           if((enroll.getStudent()==student) && (enroll.getCourse() == cr)){
                enroll.gradeCourse(arvosana);
           }   
        }
    }

    public ArrayList<Enrollment> getEnrollments(Student student){
        ArrayList <Enrollment> studentss = new ArrayList<>();
        for(Enrollment enroll:enrollments){
            if(enroll.getStudent() == student){
                studentss.add(enroll);
            }
            
        }
        return(studentss);
  
    }
    public ArrayList<Enrollment> getEnrollmentt(){
        return(enrollments);
    }


}


