 import java.util.Scanner;
 public class mark{
    public static void main(String args[]){
        System.out.println("Enter Your Mark");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark > 34){
            System.out.println("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
 }