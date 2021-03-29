public class Main{

	public static void main(String[] args) {

		int[][] newArray = Matrix.makeRandomMatrix();
		
		Matrix.turnRight(newArray);
		Matrix.turnLeft(newArray);
		Matrix.turnTranspose(newArray);
	
	}	
}