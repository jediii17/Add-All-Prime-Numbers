
import java.util.Scanner;

public class addPrimeNum {

    public static void main(String[] args) {

        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);

        String primeDisplay = " "; // Empty String
        int number, i, sum = 0;

        // ask user to enter a positive integer
        System.out.print("Enter beginning number : ");
        // store the inputted value to positiveInteger variable
        int beginNumber = sc.nextInt();

        System.out.print("Enter ending number : ");
        int endNumber = sc.nextInt();

        sc.close();

        // checking if the input is a prime number or not
        if (beginNumber <= 0 || beginNumber >= endNumber) {
            System.out.print("\n !!Invalid input, please do not enter less than 1 number!!");

        } else {
            // start of looping increment variable ending number
            for (i = beginNumber; i <= endNumber; i++) {
                int counter = 0;
                // start of looping decrement variable number by 1 after each alteration
                for (number = i; number >= 1; number--) {
                    if (i % number == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    // calculates the sum
                    sum += i;
                    // Appended the Prime number to the String
                    primeDisplay = primeDisplay + i;

                    // set + icon from the ending display
                    if (i < endNumber - 1 && i < endNumber - 6) {
                        primeDisplay += " + ";
                    }
                }
            }
        } // displaying the output
        System.out.println("\nSum of Prime Numbers:" + primeDisplay + " = " + sum);
    }
}
