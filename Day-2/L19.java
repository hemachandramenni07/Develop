package class1;
import java.util.Scanner;
public class L19 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number of terms :");
		int a=in.nextInt();
		double sum=0;
		for(int i=1;i<=a;i++) {
			double t=(1.0/i);
			sum+=t;
			System.out.print("1/"+i+"+");
		}
		System.out.println();
		System.out.print(sum);
		in.close();
	}

}
