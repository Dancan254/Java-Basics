package dailyprojos;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        int count = 0;
        do {
            Scanner sn = new Scanner(System.in);
            System.out.print("What is your name? ");
            String name = sn.nextLine();
            System.out.print("How old are you? ");
            int age = sn.nextInt();
            sn.nextLine();
            System.out.print("Enter Id number: ");
            String id = sn.nextLine();
            System.out.print("How much do you wish to pay? ");
            double fees = sn.nextInt();

            StudentDataBase studentDataBase = new StudentDataBase(name, age, id);
            studentDataBase.payTuition(fees);
            studentDataBase.showInfo();
            count++;
        }while (count <= 4);

    }
}
