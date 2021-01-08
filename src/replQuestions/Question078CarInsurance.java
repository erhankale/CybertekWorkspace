package replQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Question078CarInsurance {

    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String answer1 = scan.nextLine();
        if(answer1.equals("No")){
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();
        if(zipCode==20910 || zipCode==20740){
            premium +=60;
        }else if(zipCode==22102 || zipCode==22103){
            premium +=30;
        }else{
            premium +=50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        if(vehicleOwnership=="Owned"){
            premium +=10;
        }else{
            premium +=20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage= scan.nextLine();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium +=50;
        }else if(vehicleUsage=="Pleasure"){
            premium +=10;
        }else{
            premium +=20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium +=5*daysDrivenToWorkOrSchool;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium +=milesToWorkOrSchool;
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age<16) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16&&age<18){
            premium *=20;
        }else if(age>=18&&age<=21){
            premium *=6;
        }else if(age>21&&age<25){
            premium *=2;
        }
        System.out.println("How many years you've been driving?");
        int yearsDrive = scan.nextInt();
        scan.nextLine();
        if (age-yearsDrive<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
        premium -=yearsDrive*5;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String answer2 = scan.nextLine();
        if (answer2.equalsIgnoreCase("YES")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
        }
        premium *= 1.2 *accidentsAmount;
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.nextLine();
        if(continuousInsurance.equalsIgnoreCase("NO")){
            premium *=2;
        }
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if(education=="Phd"||education=="Bachelors"||education=="Masters"){
            premium *=0.95;
        }else if(education=="Doctors"){
            premium *= 0.9;
        }else{
            premium *= 1.05;
        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        referenceNumber=
        name.substring(0,2)+age+name.substring(name.length()-2)+zipCode+education;
        System.out.println("Reference number: "+referenceNumber.toUpperCase());






    }



}
