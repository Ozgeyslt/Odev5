import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SalaryCalculator {

    int workingDays;
    int salary;
    public int premiumPay(){
        int extraDays=workingDays-25;
        int payment=extraDays*1000 + salary;
        System.out.println(payment);
        return payment;
    }
    public SalaryCalculator(int workingDays, int salary){
        this.workingDays = workingDays;
        this.salary = salary;

        String result= (workingDays>25) ? String.valueOf(premiumPay()) : String.valueOf(salary);
        System.out.println("Your Salary :" + result);
    }

    public static void main(String[] args) {
        System.out.println("Salary Calculation Program" + "\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, write your salary");
        int salary=scanner.nextInt();
        System.out.println("Could you write how many days you worked, please?");
        int workingDays= scanner.nextInt();
        new SalaryCalculator(workingDays,salary);
    }
}