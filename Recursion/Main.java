public class Main {
    public static void main(String[] args) {
        int n = 5;
        println(1, n);
    }

    public static void println(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print("vatsala" + " ");
        println(i + 1, n);
    }
}
