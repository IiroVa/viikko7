package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        int iValinta, maxOpiskelijoita, kurssiValinta, opiskelijaValinta, arvosana;
        String kurssinNimi, kurssiID, opNumero, opNimi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        Gifu yliopisto = new Gifu(sc.nextLine());

        do{ 
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            iValinta=Integer.parseInt(sc.nextLine());

            if(iValinta==1){
                System.out.println("Anna kurssin nimi:");
                kurssinNimi= sc.nextLine();
                System.out.println("Anna kurssin ID:");
                kurssiID = sc.nextLine();
                System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                maxOpiskelijoita = Integer.parseInt(sc.nextLine());
                Course kurssi = new Course (maxOpiskelijoita, kurssinNimi, kurssiID);
                yliopisto.addCourse(kurssi);
            }else if(iValinta==2){
                System.out.println("Anna opiskelijan nimi:");
                opNimi=sc.nextLine();
                System.out.println("Anna opiskelijan opiskelijanumero:");
                opNumero=sc.nextLine();
                Student st = new Student(opNimi, opNumero);
                yliopisto.addStudent(st);

            }else if(iValinta==3){
                yliopisto.listCourses();

            }else if (iValinta==4){
                yliopisto.listStudents();

            }else if(iValinta==5){
                yliopisto.listCourses();
                System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero");
                kurssiValinta=Integer.parseInt(sc.nextLine());
                yliopisto.listStudents();
                System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero");
                opiskelijaValinta=Integer.parseInt(sc.nextLine());
                Student st = yliopisto.getStudent(opiskelijaValinta);
                Course course = yliopisto.getCourse(kurssiValinta); 
                yliopisto.enrollStudent(st, course);

            }else if(iValinta==6){
                yliopisto.listCourses();
                System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                kurssiValinta=Integer.parseInt(sc.nextLine());
                Course cr = yliopisto.getCourse(kurssiValinta);
                ArrayList<Enrollment> studentteja = yliopisto.getEnrollments(cr);
                for(Enrollment er : studentteja){
                    System.out.println("Anna arvosana opiskelijalle " + er.getStudent().getId() + " " + er.getStudent().getName());
                    arvosana = Integer.parseInt(sc.nextLine());
                    yliopisto.updateGrades(er.getStudent(),er.getCourse(),arvosana);
                    }
                
                
            }else if (iValinta==7){
                yliopisto.listCourses();
                System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                kurssiValinta=Integer.parseInt(sc.nextLine());
                Course cr = yliopisto.getCourse(kurssiValinta);
                ArrayList<Enrollment> studentteja = yliopisto.getEnrollments(cr);
                for(Enrollment er : studentteja){
                    System.out.println(er.getStudent().getId() + " " + er.getStudent().getName() + ", arvosana: " + er.getGrade() );
                }
                    
            }else if(iValinta==8){
                yliopisto.listStudents();
                System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                opiskelijaValinta = Integer.parseInt(sc.nextLine());
                Student st = yliopisto.getStudent(opiskelijaValinta);
                ArrayList<Enrollment> studentteja = yliopisto.getEnrollments(st);
                System.out.println("Opiskelijan " + st.getId() + " " + st.getName() + " arvosanat:");
                for(Enrollment er : studentteja){
                    System.out.println(er.getCourse().getId() + " " + er.getCourse().getName() + ", arvosana: " + er.getGrade());
                    
                }
            }else if(iValinta==9){
                ArrayList<Enrollment> arvosanat = yliopisto.getEnrollmentt();
                ArrayList<Course> courses = yliopisto.getCourses();
                for(Course cr : courses){
                    System.out.println(cr.getId() + " " + cr.getName());
                    for(Enrollment er: arvosanat){
                        if(er.getCourse()==cr){
                            System.out.println(er.getStudent().getId() + " " + er.getStudent().getName() + ", arvosana:" + er.getGrade());
                        }
        
                    }
                    
                }

                /*
                 * 
                     public ArrayList<Enrollment> getCourses(){
        ArrayList <Enrollment> kaikkiArvosanat = new ArrayList<>();
        for(Course cr : courses){
            
            for(Enrollment er: enrollments){
                if(er.getCourse()==cr){
                    kaikkiArvosanat.add(er);
                }

            }

        }
                 */
            }else if(iValinta==0){
                System.out.println("Kiitos ohjelman käytöstä.");
            }else{
                System.out.println("Tuntematon valinta, yritä uudelleen.");
            }
        }while(iValinta!=0);

    sc.close();
    }
}
