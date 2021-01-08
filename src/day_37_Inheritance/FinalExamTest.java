package day_37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how many questions you got in final examination : ");
        int numQuestions = scan.nextInt();
        System.out.println("Please enter how many questions you missed in final examination : ");
        int numMissed = scan.nextInt();

        FinalExam fExam = new FinalExam(numQuestions, numMissed);

        System.out.println("Your Grade is : "+
        fExam.getGrade()
        );


    }
}
