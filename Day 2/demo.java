public class demo {
    public static void main(String args[]){
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a = "orange";
        String b = new String ("orange");
        String c = b;
        
        System.out.println(a==c);
        System.out.println(f1==f2);
        System.out.println(f1.equals(f2));
    }
}
