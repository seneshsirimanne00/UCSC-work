import java.util.Scanner;
public class DayFourN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator :");
        char charN = sc.next().charAt(0);
        switch (charN) {
            case '+' :
                int answer = num1 + num2 ;
                System.out.println("Answer = "+answer);
            case '-':
                answer = num1 - num2;
                System.out.println("Answer = "+answer);
            case '*':
                answer = num1 * num2 ;
                System.out.println("Answer = "+answer);
            case '/':
                if(num1 < num2){
                    System.out.println("devision by zero cannot be done");
                }else{
                    answer = num1 / num2 ;
                    System.out.println("Answer = "+answer);
                }
            default:
                System.out.println("invalid input");
    }
}