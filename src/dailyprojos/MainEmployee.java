package dailyprojos;



import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        doWhile();
    }

    public static void doWhile(){
        Scanner sn = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        int choice;
        do {
            displayMenu();
            choice = sn.nextInt();
            sn.nextLine();

            switch (choice){
                case 1 -> {
                    System.out.print("Enter Employee name:");
                    String name = sn.nextLine();
                    System.out.print("Enter id: ");
                    String id = sn.nextLine();
                    System.out.print("Enter age: ");
                    int age = sn.nextInt();
                    System.out.print("Enter salary: ");
                    double salary = sn.nextDouble();
                    system.addEmployee(name, id, age, salary);
                }

                case 2 -> system.displayEmployees();
                case 0 -> {
                    System.out.println("Exiting.....");
                }
                default -> System.out.println("Invalid choice. Try again");
            }
            System.out.println();

        }while (choice != 0);

        sn.close();
    }

    //display menu
    public static void displayMenu(){
        System.out.println("Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

}


