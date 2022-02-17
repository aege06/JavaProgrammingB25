package javaCodingInterview;

    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    // print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
    // for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

public class Finra {
    public static void main(String[] args) {
        Finra();
    }
    public static void Finra(){

        for (int i = 1; i <= 30 ; i++) {
            if(i % 15 == 0){
                System.out.print("Finra ");
            }else if(i % 3 == 0){
                System.out.print("Fin ");
            }else if(i % 5 == 0){
                System.out.print("Ra ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}