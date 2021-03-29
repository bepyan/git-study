import java.util.Random;

public class Matrix {
	private int row, col;
	private int[][] matrix;
	private Random ran = new Random();

	public Matrix(int r, int c) {
		row = r;
		col = c;
		matrix = new int[r][c];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = ran.nextInt(1000) + 1;
			}
		}
	}

	public void firstMat() {
		System.out.println("�������");
		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" |");
		}
	}

	public void left() {
		int Nrow = row - 1;
		System.out.println("�������� 90��");
		for (int i = Nrow; i >= 0; i--) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println(" |");
		}

	}

	public void right() {
		int Ncol = col - 1;
		System.out.println("�������� 90��");
		for (int i = Ncol; i >= 0; i--) {
			System.out.print("| ");
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" |");
		}
	}

	public void transMat() {
		System.out.println("��ġ���");
		for (int i = 0; i < col; i++) {
			System.out.print("| ");
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println(" |");
		}
	}

}
