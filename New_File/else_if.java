import java.util.Scanner;
class else_if{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score>35 && score<60){
            System.out.print("Video Game");
        }
        else if(score>60 && score<90){
            System.out.print("Iphone");
        }
        else if(score>90){
            System.out.print("Macbook Pro");
        }
    }
}