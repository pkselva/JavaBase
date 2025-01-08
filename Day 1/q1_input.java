import java.util.Scanner;
public class q1_input {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String adr = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My Age is "+age);
        System.out.print("My Address is "+adr);
    }
}
