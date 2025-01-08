import java.util.Scanner;
public class meghana {
    public static void main(String args[]){
        System.out.println("Meghana is dead or alive ?");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String meghana = scan.nextLine();
        if(meghana.equals("dead")){
            System.out.print("Surya meets Ramya");
        }
        else{
            System.out.print("Surya Weds Meghana");
        }
    }
}
