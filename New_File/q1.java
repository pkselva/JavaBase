import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        System.out.println("What is the game score ?");
        Scanner scan = new Scanner(System.in);
        int s=scan.nextInt();
        if(s < 50){
            System.out.println("You need to improve");
        }
        else if(s >= 50 && s<70){
            System.out.println("Good job");
        }
        else if(s >= 70){
            System.out.print("Excellent");
        }
    }
}
