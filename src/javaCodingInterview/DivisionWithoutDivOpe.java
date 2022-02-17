package javaCodingInterview;

public class DivisionWithoutDivOpe {

    public static void main(String[] args) {
        withoutDivision(3,0);

    }
    public static void withoutDivision(int number1, int number2){
        int i = 0;
        while(number1 >= number2){
            number1 = number1 - number2;
            i++;
        }
        System.out.println(i);
    }
}

//public static void devides(int num1, int num2) {
//
//if(num2==0) {
//
//System.out.println("Invalid Number");
//
//return;
//
//}
//
//System.out.print(num1 +" devid by "+num2 +" is: ");
//
//int count =0;
//
//while(num1 >= num2) {
//
//num1 -= num2;
//
//count++;
//
//}
//
//System.out.println(count+" and remainder is "+num1);
//
//}