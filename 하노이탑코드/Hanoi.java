public class Hanoi {

	public static void main(String[] args) {

		doHanoi(3, 'A', 'C', 'B'); 		// 갯수 , 출발지 , 도착지 , 경유지
		
	}

	public static void doHanoi(int i, char start, char to,  char via) {
		
		if(i == 1) {
			System.out.print(start +" -> "+ to + "\n");
			return;
		}
		
		doHanoi(i-1 , start , via , to);
		
		System.out.println(start + " -> " + to );
		
		doHanoi(i-1 , via , to , start);
		
	}
}

