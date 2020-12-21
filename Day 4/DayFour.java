import java.util.Scanner;
public class DayFour {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char charN = sc.next().toUpperCase();
        switch (charN) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "V":
                System.out.println(" vovel");
                break;
	    default:
		System.out.println("Consonant");
        }
    }
}