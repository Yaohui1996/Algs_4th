public class Ex_01_01_13 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 7;
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                a[i][j] = i * j;
            }
        }
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.print(a[i][j]);
                if (j != cols - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }
        System.out.print("\n");
        for (int j = 0; j < cols; ++j) {
            for (int i = 0; i < rows; ++i) {
                System.out.print(a[i][j]);
                if (i != rows - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }

    }
}
