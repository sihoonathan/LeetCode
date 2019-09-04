public class twoSum {
    public static int reverse(int x) {
        int reversed = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE && pop > 7) {
                return 0;
            }

            else if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE && pop < -8) {
                return 0;
            }

            x /= 10;
            reversed = reversed * 10 + pop;

        }

        return reversed;
    }

    public static void main(String[] args) {
        reverse(321);
    }
}
