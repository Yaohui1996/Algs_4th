import edu.princeton.cs.algs4.StdOut;

public class Ex_01_01_10 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
        for(int i = 0; i < 10; ++i){
            StdOut.println(a[i]);
        }
        // 解答：它没有用 new 为 a[] 分配内存。这段代码会产生一个 variable a might not have
        // been initialized 的编译错误。
    }
}
