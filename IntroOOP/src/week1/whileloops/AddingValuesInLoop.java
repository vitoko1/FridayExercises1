package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {


    public static void main(String[] args) {

        Integer sum = 0;
        boolean bol = true;

        while (bol == true) {

            Scanner scan = new Scanner(System.in);
            System.out.println(" I will add up the numbers you give me.");
            System.out.println(" Number: ");

            Scanner scanNumber = new Scanner(System.in);
            String sumString = scan.nextLine();
            Integer value = Integer.parseInt(sumString);
            sum = sum + value;
            System.out.println(" The total so far is "+ sum);

            if (value == 0) {
                System.out.println(" The total is "+ sum);
                bol = false;
            }

        }

    }

}
