public class hanoi {
    public static void main(String[] args) {
        int num = 4;
        hanoi(num, 'A', 'B', 'C');
    }

    static void hanoi(int num, char start, char end, char via) {
        if (num == 1) {
            move(1, start, via);
        } else {
            hanoi(num - 1, start, end, via);
            move(num, start, via);
            hanoi(num - 1, end, via, start);
        }
    }

    static void move(int num, char start, char end) {
        System.out.printf("%d번째 원판 %d번->%d번으로 이동 \n", num, start, end);
    }
}
