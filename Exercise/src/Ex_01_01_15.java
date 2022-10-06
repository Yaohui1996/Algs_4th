// 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小
// 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
// 之间，返回数组中所有元素之和应该和 a.length 相等。
public class Ex_01_01_15 {
    public static int[] histogram(int[] a, int M) {
        int[] ret = new int[M];
        for (int i = 0; i < a.length; ++i) {
            ++ret[a[i]];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 1, 1, 2, 3, 4, 5, 6, 6, 6, 7};
        int[] b = histogram(a, 8);
        for (int i = 0; i < b.length; ++i) {
            System.out.printf("%d出现的次数为：%d\n", i, b[i]);
        }
        System.out.println();

    }
}
