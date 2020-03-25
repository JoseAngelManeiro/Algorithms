package main;

/*
* With this formula we can count the sum
* of a consecutive list of numbers in a constant time.
* */
public class CountTotal {

    public int solution(int[] a) {
        int n = a[a.length - 1];
        return n * (n + 1) / 2;
    }
}
