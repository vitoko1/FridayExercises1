package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");

        String userName = scan.nextLine();

        System.out.println("Hi," + userName + "!" + "How old are you?");

        Scanner scanAge = new Scanner(System.in);

        String age = scanAge.nextLine();

        System.out.println("So you're " + age + " , eh?  That's not old at all!" +
                " How much do you make," + userName);

        Scanner scanWage = new Scanner(System.in);

        String wage = scanWage.nextLine();

        System.out.println(wage + "! " + " I hope that's per hour and not per year! LOL!");

    }


}
