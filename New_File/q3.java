import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the traffic signal colour?");
        String light = scan.nextLine();
        String r = "red";
        String y = "yellow";
        String g  = "green";
        if(light.equals(r)){
            System.out.print("Stop");
        }
        else if(light.equals(y)){
            System.out.print("Get Ready");
        }
        else if(light.equals(g)){
            System.out.print("Go");
        }
    }
}
