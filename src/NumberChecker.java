import java.util.Scanner;

public class NumberChecker {
    /**
     * this program checks whether a number is positive, negative or zero
     * it uses a method that take in a number and checks for  the conditions
     */

    public static void main(String[] args) {
       Scanner sn  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sn.nextInt();

        //call the method
        numChecker(number);
        sn.close();
    }

    //method should not return anything
    static void numChecker(int number){
        //first method, using if else statements
//        if (number < 0){ System.out.println("The number is negative!!");}
//        else if(number == 0){ System.out.println("Number is equal to zero");}
//        else {System.out.println("The number is positive");}
//
        //method 2 using tenary operator
       System.out.println((number < 0 ? "negative" : number == 0? "Zero" : "Positive"));
    }
}
