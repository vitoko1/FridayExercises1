package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");

        String userName = scan.nextLine();

        System.out.println("Hi," + userName + "!" + "How old are you?");

        Scanner scanAge = new Scanner(System.in);
        String age = scan.nextLine();

        Integer ageInt=     Integer.parseInt(age);
        Integer ageFuture= ageInt+5;
        Integer agePass= ageInt-5;

        System.out.println("Did you know that in five years you will be "+ ageFuture+" years old?"+
                "And five years ago you were "+agePass+ "! Imagine that!");

    }
}
