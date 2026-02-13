package class1;
import java.util.Scanner;
public class L3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number of terms:");
		int a = in.nextInt();
		for (int i=0;i<=a;i++) {
			System.out.println("The cude of the numbers"+" "+i+" "+"is"+" "+(i*i*i));
			
		}
		in.close();
	}

}
