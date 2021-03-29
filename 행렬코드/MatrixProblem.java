package Matrix;

public class MatrixProblem {
    public static void main(String[] args) {
        Matrix srcMat = new Matrix(4, 4);   // 4*4 행렬 생성
        try {
            Matrix rightMat = (Matrix)srcMat.clone();
            Matrix leftMat = (Matrix)srcMat.clone();
            Matrix transMat = (Matrix)srcMat.clone();
            
            rightMat.rightRotation();
            leftMat.leftRotation();
            transMat.transpose();

            System.out.printf("최초행렬 \t\t\t\t우측으로 90도 회전 \t   좌측으로 90도 회전 \t\t  전치행렬 \n");
            for (int i = 0; i < 4; i++) {
                srcMat.printRow(i);
                rightMat.printRow(i);
                leftMat.printRow(i);
                transMat.printRow(i);
                System.out.println();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
