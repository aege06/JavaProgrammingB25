package javaCodingInterview;

import java.util.Scanner;

public class Even_OddNums {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=scan.nextInt();

        find_EvenOdd(num);//calling the method
    }

    static void find_EvenOdd(int num){//method definition
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
