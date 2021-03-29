import java.util.Scanner;

public class FiboRepeat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		int input = sc.nextInt();
		
		System.out.println(doFibo(input));
		
	}

	public static int doFibo(int input) {
		
		if (input <= 1) {
			return input;
		}
		
		int sum = 0;
		int val0 = 0;
		int val1 = 1;
		
		for (int i=0 ; i < input ; i++) {
			val0 = val1;
			val1 = sum;
			sum = val0 + val1;
		}
		
		return sum;
		
	}
}
