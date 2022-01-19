package replitAnswers;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        // Enter your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        String sub1=input.next();
        double score1=input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject") ;
        String sub2=input.next();
        double score2=input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject") ;
        String sub3=input.next();
        double score3=input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject") ;
        String sub4=input.next();
        double score4=input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject") ;
        String sub5=input.next();
        double score5=input.nextDouble();

        System.out.println("Summary: "+sub1+ " - "+score1+", "+sub2+ " - "+score2+", "+sub3+ " - "+score3+", "+sub4+ " - "+score4+", "+sub5+ " - "+score5);
        double average= (score1+score2+score3+score4+score5)/5;
        System.out.println("Your average score is: "+average);
        System.out.println("Thank you for using Grader!\nGoodbye!");




    }
}
