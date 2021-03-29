import java.util.Scanner;

public class recursiveFibonacchi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int val = s.nextInt();
        System.out.println(val + " 번째 피보나치 수는 : " + fibonacchi(val));
    }

    static int fibonacchi(int val) {
        if (val <= 1) return val;
        else {
            return fibonacchi(val-1) + fibonacchi(val-2);
        }
    }
}
