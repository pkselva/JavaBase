import java.util.Scanner;

public class scholar {
    public static void main(String args[]){
        System.out.println("Enter Your Income");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if(var > 6999){
            System.out.println("Scholarship is Available");
        }
        else{
            System.out.print("Not Eligible for Scholarship");
        }
    }
}
