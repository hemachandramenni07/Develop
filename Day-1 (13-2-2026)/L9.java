package class1;
import java.util.Scanner;
public class L9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int a = in.nextInt();
		
		for (int i=1;i<=a;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
