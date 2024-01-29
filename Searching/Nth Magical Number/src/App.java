public class App {

    public static long GCDEuclid(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) return a;

        return GCDEuclid(b, a % b); // Euclid's Algorithm to calculate the GCD of two numbers
    }

    public static long LCM(long a, long b) {
        if (a == 0 || b == 0) return 0; // Handle the case when either a or b is zero
        return Math.abs(a / GCDEuclid(a, b)) * b;
    }

    public static int nthMagicalNumber(int n, int a, int b) {
        long MOD = 1_000_000_007;
        long low = Math.min(a, b);
        long high = (long) n * low;
        long ans = -1;

        long lcm = LCM(a, b);

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = mid / a + mid / b - mid / lcm;

            if (count == n) {
                ans = mid;
                high = mid - 1;
            } else if (count < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) (ans % MOD);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(nthMagicalNumber(1,2,3));
    }
}
