import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int avg = (a+b+c+d+e)/5;
        if(avg < 35){
            System.out.println("Additional Class is required");
        }
        else if(avg >=35){
            System.out.println("You are good to go");
        }
    }
}
