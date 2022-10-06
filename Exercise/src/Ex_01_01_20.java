public class Ex_01_01_20 {
    public static double ln_Factorial(int N) {
        if (N == 1 || N == 0) {
            return 0;
        }
        return Math.log(N) + ln_Factorial(N - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; ++i) {
            System.out.println(ln_Factorial(i));
        }
    }
}
