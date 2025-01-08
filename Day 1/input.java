import java.lang.System;
import java.util.Scanner;
class input{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = b+c;
        System.out.print(a);
        System.out.print(d);
    }
}
