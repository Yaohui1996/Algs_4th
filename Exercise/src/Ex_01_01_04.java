public class Ex_01_01_04 {
    public static void main(String[] args) {
        // a. if (a > b) then c = 0;
        // 不应该用then

        // b. if a > b { c = 0; }
        // a > b应当用括号括起来，即(a > b)

        int a = 2;
        int b = 1;
        int c = 3;
        if (a > b) c = 0; // c. 没问题

        // if (a > b) c = 0 else b = 0;
        // 应改为:
        if (a > b) c = 0; else b = 0;
    }
}
