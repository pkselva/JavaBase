import java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double mark = scan.nextDouble();
        scan.nextLine();
        String dep = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My score is "+mark/10 +"/10");
        System.out.print("My department is "+dep);
    }
}
