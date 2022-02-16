package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Hey, what's your name? (Sorry, I keep forgetting.)");


        String userName = scan.nextLine();
        System.out.println("  Ok, " + userName + ", how old are you?");

        Scanner scanAge = new Scanner(System.in);
        String age = scan.nextLine();

        Integer ageInt=  Integer.parseInt(age);

        if( ageInt < 16 ){

            System.out.println(" You can't drive.");
        }
        else if (ageInt > 15 && ageInt < 18  ){
            System.out.println(" You can drive but not vote.");

        }
        else if (ageInt > 17 && ageInt < 25 ){
            System.out.println(" You can vote but not rent a car.");
        }
        else if (ageInt >24  ){

            System.out.println(" You can do pretty much anything.");
        }



    }


}
