public class nested_if {
    public static void main(String args[]){
        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = false;

        if(kfc){
            System.out.println("Enter into KFC");
            if(chicken){
                System.out.println("Eating Chicken");
                if(pepsi){
                    System.out.println("Drinking pepsi");
                }
            }
        }
    }
}
