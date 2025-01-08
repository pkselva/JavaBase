import java.util.Scanner;

public class oddeven {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.print("ODD");
        }
    }
}
