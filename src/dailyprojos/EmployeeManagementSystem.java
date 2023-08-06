package dailyprojos;

/**
 * the program is designed to record data for employees to the given limit
 * it requires name, age, id, salary and number of employees
 * max number depends on the user preference and should be declared as final
 * methods required are...add employees, print the list,
 */
public class EmployeeManagementSystem {

    private final int MAX_EMPLOYEES = 2;
    private String[] names;
    private String[] Id;
    private int[] ages;
    private double[] salaries;
    private  int numOfEmployees;

    //constructor


//    public EmployeeManagementSystem(String[] names, String[] id, int[] ages, double[] salaries) {
//        this.names = names;
//        Id = id;
//        this.ages = ages;
//        this.salaries = salaries;
//        numOfEmployees = 0;
//    }

    public EmployeeManagementSystem() {
        names = new String[MAX_EMPLOYEES];
        Id = new String[MAX_EMPLOYEES];
        ages = new int[MAX_EMPLOYEES];
        salaries = new double[MAX_EMPLOYEES];
        numOfEmployees = 0;
    }

    //method to add employees
    public  void addEmployee(String name, String id, int age, double salary){
        if (numOfEmployees < MAX_EMPLOYEES){
            names [numOfEmployees] = name;
            Id[numOfEmployees] = id;
            ages[numOfEmployees]= age;
            salaries[numOfEmployees] = salary;
            numOfEmployees++;
            System.out.println("Employee successfully added:");
        }else{
            System.out.println("Maximum number of employees reached");
        }
    }

    //display employees
    public void displayEmployees() {
        System.out.println("Employee List:");
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Salary: " + salaries[i]);
        }
    }


    //getters


    public int getMAX_EMPLOYEES() {
        return MAX_EMPLOYEES;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getId() {
        return Id;
    }

    public void setId(String[] id) {
        Id = id;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }
}


