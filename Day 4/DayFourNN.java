import java.util.Scanner;
public class DayFourNN {
    public static void main(String args[]) {
        /*Scanner sc = new Scanner(System.in);
        int num;
        try {
            for (int i = 1; i < 11; i++) {
                System.out.print(i + ". Enter number :");
                num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }catch(Exception e){
            System.out.println(" enter a integer only");
        }*/


	/*for(int row=0;row<=3;row++){
	for(int col=0;col<=3;col++)
	System.out.print("* ");
	System.out.print( );*/



	/*for(int row=0;row<8;row++){
            for(int col=0;col<8;col++)
            if(row==col);
                System.out.print("* ");
            else
            System.out.print(" ");
            System.out.println();

        }*/

	
	/*for(int i=1;i<=10;i++)
		System.out.println(i);*/
	
	int i =1;
	int tot =0;
	while(i<=10) {
		tot=tot+i;
		i++;
	}
	System.out.println(tot);
    		

	
	
    }
}