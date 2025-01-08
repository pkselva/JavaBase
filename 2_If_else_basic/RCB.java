import java.util.Scanner;
public class RCB {
    public static void main(String args[]){
        System.out.println("Will RCB Win or Lose?");
        try (Scanner scan = new Scanner(System.in)) {
            String RCB = scan.nextLine();
            if(RCB.equals("Win")){
                System.out.println("Ee sala cup Namdhey");
            }
            else{
                System.out.print("cup illa");
            }
        }
    }
}