// 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号。

public class Ex_01_01_11 {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 11;
        boolean[][] a = new boolean[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (i * j % 2 == 0) {
                    a[i][j] = true;
                } else {
                    a[i][j] = false;
                }
            }
        }

        // 打印第一行
        System.out.print("\t");
        for (int j = 0; j < cols; ++j) {
            if (j != cols - 1) {
                System.out.printf("%d\t", j + 1);
            } else {
                System.out.printf("%d\n", j + 1);
            }
        }
        for (int i = 0; i < rows; ++i) {
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < cols; ++j) {
                if (a[i][j]) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }

    }
}
