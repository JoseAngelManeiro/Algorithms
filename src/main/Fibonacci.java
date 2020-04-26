package main;

/*
* The enumeration of the Fibonacci numbers can be done easily
* if we first assign the first 2 values (0 and 1),
* and then follow the sequence by calculating the sum of the two previous numbers.
* Time complexity -> O(n)
* */
public class Fibonacci {
    
    public int[] solution(int n) {
        int fib[] = new int[n];
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
