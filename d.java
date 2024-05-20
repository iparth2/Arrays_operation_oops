import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.setElements();
        matrix.printArray();

        Operations operations = new Operations();
        operations.performOperation(matrix);
    }
}

class Matrix {
    private int[][] arr;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
    }

    public void setElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void printArray() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getArray() {
        return arr;
    }
}

class Operations {
    public void performOperation(Matrix matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addMatrix(matrix);
                break;
            case 2:
                subtractMatrix(matrix);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private void addMatrix(Matrix matrix) {
        int[][] arr = matrix.getArray();
        // Perform addition operation
    }

    private void subtractMatrix(Matrix matrix) {
        int[][] arr = matrix.getArray();
        // Perform subtraction operation
    }
}
