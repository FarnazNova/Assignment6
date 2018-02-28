import java.util.Scanner;
import java.util.Arrays;
public class Assignment6 {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] num = new double[3];
		System.out.println("Please enter three numbers:");
		// get an input from users
		for(int i = 0; i < 3; i++)
		{		
		num[i] = scan.nextInt();
		}
		//invoke the method to sort the numbers
		dispclaySortedNumbers(num[0], num[1], num[2]);	
		scan.close();
	}
	
	public static void dispclaySortedNumbers(double num1, double num2, double num3)
	{
		Scanner scan = new Scanner(System.in);
		double[] num = {num1, num2, num3};
		Arrays.sort(num);
		System.out.print(Arrays.toString(num));
		scan.close();
	}

}
