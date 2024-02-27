package main;

public class Enrollment {

    private int grade;
    private Student st;
    private Course course;
    public Enrollment(int grade, Student st, Course course){
        this.grade=grade;
        this.st=st;
        this.course=course;

    }

    public void gradeCourse(int grade){
        this.grade = grade;

    }
    
    public Student getStudent(){
        return(st);
    }

    public Course getCourse(){
        return(course);
    }

    public int getGrade(){
        return(grade);
    }
}
