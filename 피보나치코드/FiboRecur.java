import java.util.Scanner;

public class FiboRecur {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		int input = sc.nextInt();
		
		System.out.println(doFibo(input));
	
	}

	public static int doFibo(int input) {
		
		if(input <= 1) {
			return input;
		}
		else {
			return doFibo(input-1) + doFibo(input-2);
		}
		
	}
	
}