import java.util.Scanner;

public class divisible {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("It is divisible by 3 and 5");
        }
        else{
            System.out.print("Not divisible by 3 and 5");
        }
    }
}