import java.util.Scanner;

public class FibonacciB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number? ");
		int N = sc.nextInt();
		
		Fibo(0,1,N);
		
	}
	static int count=2;
	public static void Fibo(long valA, long valB,int n) {
		long valC = valA + valB;
		count ++;
		
		if(count == n) 
		{
			System.out.print(valC);
			return;
		}
		
		Fibo(valB, valC, n);
	}
}