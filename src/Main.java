public class Main {

    public static void main(String[] args) {
        System.out.println(passThePillow(18, 38));

    }

    public static int passThePillow(int n, int time) {
        int mod = time % (n - 1);
        int divide = time / (n - 1);
        if (divide % 2 == 0) {
            return 1 + mod;
        }
        return n - mod;
    }
}