import java.util.Scanner;
public class Day4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        String charN = sc.next().toUpperCase();
        switch (charN) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "V":
                System.out.println(" vovel");
                break;
        }
    }
}