import java.util.Scanner;

public class Item {
    String itemName;
    int itemCode;
    double price;

        Item( String iName, int iCode, double price){
            itemCode=iCode;
            itemName=iName;
            this.price=price;
        }

        void display(){
            System.out.println("Item name: "+ itemName);
            System.out.println("Item code: "+ itemCode);
            System.out.println("Item price: "+ price);
        }

        double totalCost(int n){
            return n*price;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter item name: ");
            String iname=sc.nextLine();

            System.out.println("Enter item code: ");
            int icode=sc.nextInt();


            System.out.println("Enter price: ");
            double price=sc.nextDouble();

            Item i1=new Item(iname,icode,price);
            i1.display();
            System.out.println("total cost= "+ i1.totalCost(5));
            sc.close();
        }
}

