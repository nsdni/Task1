public class Matrix {
    int lines;
    int columns;
    double[][] matrixA = new double[this.lines][this.columns];
    public Matrix(double[][] matrix, int columns, int lines) {
        this.matrixA = matrix;
        this.columns = columns;
        this.lines = lines;
    }

    public void printing() {
        System.out.println("вывод матрицы: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void amount(double[][] A, double[][] B) {
        System.out.println("Сложение матриц: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }

    public void multiply(double[][] A, double num) {
        System.out.println("Умножение на число ("+(int)num+"): ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((A[i][j] * num) + " ");
            }
            System.out.println("");
        }
    }
}