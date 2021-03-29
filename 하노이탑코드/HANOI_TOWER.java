
public class HANOI_TOWER {

	public static void main(String[] args) {
		hanoi(3,1,3,2);
	}
	public static void hanoi(int n, int start, int dest, int assist ) {
		    if (n == 1) {
		        System.out.println(start + "->" + dest);
		        return;
		    }
		    hanoi(n - 1, start, assist, dest);
		    System.out.println(start + "->" + dest);
		    hanoi(n - 1, assist, dest, start);
		}
}