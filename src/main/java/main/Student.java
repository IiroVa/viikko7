package main;

public class Student implements PrintInfo {
    private String name;
    private String id;
    
    public Student(String name, String id){
        this.name = name;
        this.id=id;
    }
    public void getInformation(){
        
    }

    public String getName(){

        return(name);
    }

    public String getId(){
        return(id);
    }
}
