package main;

/*
* By creating an array of prefix sums
* we can calculate the sum of any segment of the array in a constant time.
* */
public class PrefixSums {

    public int solution(int[] a, int x, int y) {
        int[] p = prefixSums(a);
        return p[y + 1] - p[x];
    }

    private int[] prefixSums(int[] a) {
        int[] p = new int[a.length + 1];
        for (int i = 1; i < p.length; i++) {
            p[i] = p[i - 1] + a[i - 1];
        }
        return p;
    }
}
