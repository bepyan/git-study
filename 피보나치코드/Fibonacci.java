import java.util.Scanner;

public class Fibonacci {
//At(50) is 12.586.269.025; and max int is 2.147.483.647
	public static void main(String[] args) {
		long valA = 0;
		long valB = 1;
		long count = 2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number? ");
		long valC = sc.nextLong();
		//System.out.print(valA + " ");
		//System.out.print(valB + " ");
		
		while (true) {
			long sum = valA + valB;
			long temp = sum;
			count++;
			valA = valB;
			valB = temp;
			if (count == valC) {
				System.out.print(sum + " ");
				break;
			}
		}
		sc.close();
	}

}
