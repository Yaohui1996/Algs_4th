public class Ex_01_01_18 {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int new_mystery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return new_mystery(a * a, b / 2);
        return new_mystery(a * a, b / 2) * a;
    }

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        System.out.println(new_mystery(2, 25));
        System.out.println(new_mystery(3, 11));
    }
}
