package Matrix;

public class Matrix implements Cloneable {
    private int row, colum;
    public int matrix[][];

    Matrix(int row, int colum) {    // 행렬의 크기와 값 설정
        this.row = row;
        this.colum = colum;
        this.matrix = new int[row][colum];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.colum; j++) {
                matrix[i][j] = (int)((Math.random() * 999) + 1);
            }
        }
    }

    Matrix(Matrix m) {
        row = m.row;
        colum = m.colum;
        matrix = m.matrix;
    }

    void rightRotation() {                      // 회전한 후의 행은 회전하기 전의 열과 같다.
        int tempMatrix[][] = new int[row][colum];     // 회전한 후의 열은 N행렬의 N에서 -1을 하고 회전하기 전의 행을 빼면 된다.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                tempMatrix[j][4 - 1 - i] = matrix[i][j];
            }
        }
        matrix = tempMatrix;
    }
    void leftRotation() {                      // 회전한 후의 행은 N행렬의 N에서 -1을 하고 회전하기 전의 열을 빼면 된다.
        int tempMatrix[][] = new int[row][colum];     // 회전한 후의 열은 회전하기 전의 행과 같다.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                tempMatrix[4 - 1 - j][i] = matrix[i][j];
            }
        }
        matrix = tempMatrix;
    }

    void transpose() {                    // 전치행렬은 주대각성분을 기준으로 상,하 성분을 교체하면 된다.
        int temp;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < colum; j++) {
                if (i == j) continue;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    void recursiveTranspose() {

    }

    void printRow(int line) {
        System.out.print("|");
        for (int i = 0; i < colum; i++) {
            System.out.printf(" %3d ", matrix[line][i]);
        }
        System.out.print("| ");
    }
    @Override
    public Matrix clone() throws CloneNotSupportedException {   // Object class의 메소드 clone()을 재정의한다.
        Matrix changeMatrix = (Matrix) super.clone();           // clone은 Cloneable의 추상메소드
        int copyMatrix[][] = new int[row][colum];               // 기존의 배열을 참조하지 않도록 새로운 배열을 만듬
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.colum; j++) {
                copyMatrix[i][j] = this.matrix[i][j];           // 기존 배열이 값을 새로운 배열에 저장
            }
        }
        changeMatrix.matrix = copyMatrix;                       // 복사된 기존의 배열을 새로운 배열로 교체
        return changeMatrix;
    }
}
