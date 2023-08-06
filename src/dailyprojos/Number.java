package dailyprojos;
/**
 * the following program is used to predict the pattern of given numbers
 * the user then enters the number he wishes to extract from the pattern
 */

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the index of the number you wish to access: ");
        int num = sn.nextInt();
        System.out.print("Enter number one: ");
        int num1 = sn.nextInt();
        System.out.print("Enter number two: ");
        int num2 = sn.nextInt();

        int count = 2;
        while (count <= num){
            int temp = num2;
            num2 = num2 + num1;
            num1 = temp;
            count++;
        }
        if (num != num2){
        System.out.println(num2);
        }
        else {
            System.out.println("no pattern detected");
        }

        sn.close();
    }
}
