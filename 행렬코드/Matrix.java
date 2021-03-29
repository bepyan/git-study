public class Matrix {

		public static int[][] makeRandomMatrix () {
			
			int[][] randomArray = makeMatrix();
			
			for(int i = 0 ; i < 4 ; i++) {
				
				for(int j = 0 ; j < 4 ; j++) {
					
					do {
						
					randomArray[i][j] = (int)(Math.random() * 1000);
					
					} while(randomArray[i][j] == 0);
					
				}
				
			}
			
			System.out.println("�������");
			printMatrix(randomArray);

			return randomArray;
			
		}
		
		public static void turnRight(int[][] array) {
			
			int[][] right =  makeMatrix();
			
			for(int i = 0 ; i < 4 ; i++) {
				
				for (int j = 0 ; j < 4 ; j++) {
					
					right[j][3-i] = array[i][j];
				}
			}
			
			System.out.println("�������� 90�� ȸ��");
			printMatrix(right);
	
		}
		
		public static void turnLeft(int[][] array ) {
			
			int[][] left = makeMatrix();
			
			for (int i = 0 ; i < 4 ; i++) {
				
				for ( int j = 0 ; j < 4 ; j ++) {
					
					left[3-j][i] = array[i][j];
				}
				
			}
			
			System.out.println("�������� 90�� ȸ��");
			printMatrix(left);
		}
		
		public static void turnTranspose (int[][] array) {
			
			int[][] trans = makeMatrix();
			
			for (int i = 0 ; i < 4 ; i++) {
				
				for (int j = 0 ; j < 4 ; j++) {
					
					trans[j][i] = array[i][j];
				}
				
			}
			
			System.out.println("��ġ ���");
			printMatrix(trans);
			
		}
		
		public static int[][] makeMatrix () {
			
			int[][] newArray = new int [4][4];
			
			return newArray;
			
		}
		
		public static void printMatrix(int[][] matrix) {
			
			for(int i = 0 ; i < 4 ; i++) {
				
				System.out.print("|\t");
				
				for (int j = 0 ; j < 4 ; j++) {
					
					System.out.print(matrix[i][j] + "\t");
				}

				System.out.println("|");
			}
			
			System.out.println("\n");
		}
		
}
