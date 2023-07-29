package dailyprojos;

public class StudentDataBase {
    private String name;
    private int age;
    private String ID;
    private double tuitionFees;
    private double balance = 800;


    public StudentDataBase(String name, int age, String ID) {
        this.name = name;
        if (age <= 0){
            System.out.println("Invalid age");
            this.age = 0;
        }
        else{
            this.age = age;
        }
        this.ID = ID;
        this.tuitionFees = tuitionFees;

    }

    //method for paying tuition
    public void payTuition(double payment){
       if (payment > 0){
           if(balance > payment){
           balance -= payment;
           showBalance();
           }else {
               double extraPay = payment - balance;
               System.out.println("You paid an extra of: " + extraPay);
               balance = 0;
               showBalance();
           }
       }else{
           System.out.println("invalid amount");
       }
    }
    //method for showing balance
    public void showBalance(){
        System.out.println("Your tuition balance is: " + balance);
    }
    public void showInfo(){
        System.out.println("Name: " + name + "\nAge: " + age +
                "\nID: " + ID + "\nTuition balance: " + balance);
    }
    

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }
}
