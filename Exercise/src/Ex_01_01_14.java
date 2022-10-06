// 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N 的最大整数。不要使用 Math 库。

public class Ex_01_01_14 {
    public static int lg(int N) {
        int ret = 0;
        int x = 1;
        while (x <= N) {
            x *= 2;
            ++ret;
        }
        return ret - 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            System.out.printf("不大于lg2(%d)的最大整数为%d\n", i, lg(i));
        }

    }
}
