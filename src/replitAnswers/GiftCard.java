package replitAnswers;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int balance = 100;
        int blanket = 60;
        int charger = 15;
        int hat = 25;
        int headphones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usb = 10;


        String r = "";

        if (s.equals("Blanket") && balance >= blanket) {
            balance -= blanket;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Charger") && balance >= charger) {
            balance -= charger;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Hat") && balance >= hat) {
            balance -= hat;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Headphones") && balance >= headphones) {
            balance -= headphones;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Laptop") || s.equals("Smartphone") && balance < smartphone) {
            r = "Sorry, not enough funds on your gift card!";
        } else if (s.equals("Pants") && balance >= pants) {
            balance -= pants;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Pillow") && balance >= pillow) {
            balance -= pillow;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Socks") && balance >= socks) {
            balance -= socks;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else if (s.equals("Usb") && balance >= usb) {
            balance -= usb;
            r = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        } else {
            r = "Invalid item!";
        }

        System.out.println(r);
    }
}
