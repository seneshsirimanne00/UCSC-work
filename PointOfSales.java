import java.util.Scanner;
public class PointOfSales {
    public static void main(String args[]) {
        int item1price = 25;
        int item2price = 60;
        int item3price = 100;
        int item1amount = 20;
        int item2amount = 30;
        int item3amount = 40;
        int total = 0;
        boolean bool = true;
        System.out.println(" supermarket ");
        System.out.println(" Enter B to select items ");
        System.out.println(" Enter P to pay");
        while(bool){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option :");
            String Option =sc.next().toUpperCase();
            switch (Option) {
                case "B":
                    while(true){
                    System.out.println("Enter item no to buy (1,2 or 3) or 0 to stop buying :");
                    int itemid =sc.nextInt();
                    if(itemid == 1){
                        System.out.print("Enter amount :");
                        int buyingamout =sc.nextInt();
                        total=total+(item1price * buyingamout);
                        item1amount = item1amount - buyingamout;
                        System.out.println(buyingamout +" of  item 1 added.");
                    }else if (itemid == 2){
                        System.out.print("Enter amount :");
                        int buyingamout =sc.nextInt();
                        total=total+(item2price * buyingamout);
                        item2amount = item2amount - buyingamout;
                        System.out.println(buyingamout +" of item 2 added.");
                    }else if (itemid == 3){
                        System.out.print("Enter amount :");
                        int buyingamout =sc.nextInt();
                        total=total+(item3price * buyingamout);
                        item3amount = item3amount - buyingamout;
                        System.out.println(buyingamout +" of item 3 added.");
                    }else if(itemid == 0){
                        break;
                    }
                    }
                    break;
                case "P":
                    System.out.println("Total amount to pay = " + total);
                    System.out.print("Cash amount paid by customer :");
                    int cash = sc.nextInt();
                    int balance = cash - total ;
                    System.out.println(" balance : "+ balance);
                    bool = false;
                    break;
                default:
                    System.out.println("invalid input try again");
            }

        }


    }
}