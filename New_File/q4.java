import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter your salary and age :");
        int salary = scan.nextInt();
        int age = scan.nextInt();
        if(salary >= 20000 || age <=25){
            System.out.print("Enter your Required Loan Amount: ");
            int amt = scan.nextInt();
            if(amt <= 50000){
                System.out.print("You are eligible for loan");
            }
            else{
                System.out.print("Maximum loan amount");
            }
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}
