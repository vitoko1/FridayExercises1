package week1.forloops;

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Count to:");
        String sumString = scan.nextLine();

        int numberTillCount= Integer.parseInt(sumString);

        for(int i = 0; i <= numberTillCount; i++){

            System.out.print(i);
        }


    }

}
