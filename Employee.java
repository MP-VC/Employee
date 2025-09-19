/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>=16)
        {
            System.out.println("You can drive");
            return true;
        }
        else
        {
            int remainingyears = 16 - age;
            System.out.println("You have to wait " + remainingyears);
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    public double calculatePay(){
        double taxes =0.3;
        double pay = (hourlyWage*unpaidHours)-((hourlyWage*unpaidHours)*taxes);
        return pay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double pay = calculatePay();
        System.out.println(fullname + " is going to be paid " + pay + "CAD");
        unpaidHours = 0.0;
    }
    /*
     * Gets year of birth
     */
    public int getyearOfBirth()
    {
        return yearOfBirth;
    }
    /*
     * Sets year of birth
     */
    public int setyearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
        return yearOfBirth;
    }
}