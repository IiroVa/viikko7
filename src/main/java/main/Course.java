package main;

public class Course {
    private int maxNumberOfStudents;
    private String name;
    private String id;
    

    public Course(int max, String name, String id){
        this.maxNumberOfStudents=max;
        this.name=name;
        this.id=id;

    }

    public int getInformation(){
        return(maxNumberOfStudents);
    }

    public String getName(){
        return(name);
    }
    public String getId(){
        return(id);
    }
}
