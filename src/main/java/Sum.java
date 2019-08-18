public class Sum {
    public int GetSum(int a, int b) {
        int max = Math.max(a, b);
        int sum = 0;
        for (int current = Math.min(a, b); current <= max; current++) {
            sum += current;
        }
        return sum;
    }
}
