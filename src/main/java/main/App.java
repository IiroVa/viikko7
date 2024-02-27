package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        int iValinta, maxOpiskelijoita;
        String kurssinNimi, kurssiID;
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
                System.out.println("Luo uusi opiskelija");

            }else if(iValinta==3){
                yliopisto.listCourses();

            }else if (iValinta==4){
                System.out.println("Listaa opiskelijat");

            }else if(iValinta==5){
                System.out.println("Lisää opiskelija kurssille");

            }else if(iValinta==6){
                System.out.println("Anna kurssi arvosanat");
                
            }else if (iValinta==7){
                System.out.println("Listaa kurssilla olevat opiskelijat");
            }else if(iValinta==8){
                System.out.println("Listaa opiskelijan arvosanat");

            }else if(iValinta==9){
                System.out.println("Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat");
            }else if(iValinta==0){
                System.out.println("Kiitos ohjelman käytöstä");
            }else{
                System.out.println("Tuntematon valinta, yritä uudelleen.");
            }
        }while(iValinta!=0);
    }
}
