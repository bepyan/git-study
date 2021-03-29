import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int val = s.nextInt();

        System.out.println(val + " 번째 피보나치 수는 : " + fibonacchi(val));
    }

    static int fibonacchi(int val) { //반복을 이용하여 피보나치 수 val 계산
        int val0 = 0, val1 = 1, val2 = 0;
        if (val <= 1) return val;
        else {
            for (int i = 2; i <= val; i++) {
                val2 = val0 + val1;
                val0 = val1;
                val1 = val2;
            }
            return val2;
        }
    }
}
