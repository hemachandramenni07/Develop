package class1;
import java.util.Scanner;
public class L5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number of terms:");
		int a = in.nextInt();
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=a;j++) {
				System.out.print(j+" "+"x"+" "+i+" "+"="+" "+(j*i)+"   ");
			}
			System.out.println();
			
			
		}
		in.close();
	}

}
