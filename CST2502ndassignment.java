/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst2502ndassignment;

/**
 *
 * @author ssyed
 */
import java.util.Scanner;
public class CST2502ndassignment {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fifthDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int sixthDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int sevenithDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit + fifthDigit + sixthDigit + sevenithDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}
    

