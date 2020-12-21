import java.util.Scanner;
public class calculator {
    public static void main(String args[]) {
        char op;
        int total =0;
        int num2 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("continues calculator");
        System.out.print(" Enter number :");
        total = sc.nextInt();
        //while (op != "=") {
        boolean bool = true;
        while (bool){
            System.out.print(" Enter operator :");
            op = sc.next().charAt(0);
            if(op != '=') {
                System.out.print(" Enter number  :");
                num2 = sc.nextInt();
            }
            if(op == '+'){
                total = total+num2;
            }else if(op =='-'){
                total = total-num2;
            }else if(op == '*'){
                total = total*num2;
            }else if(op == '/'){
                if(total<num2){
                    System.out.println(" can't divide by zero !");
                }else{
                    total = total/num2;
                }
            }else if(op == '='){
                System.out.println("  "+ total);
                bool = false;
            }
        }

    }
}