package main;

/*
* This technique is based on searching for the smallest item in the array
* and then exchanging it for the current item.
* Time complexity -> O(n^2)
* */
public class SelectionSort {

    public int[] solution(int[] a) {
        int n = a.length;
        int minimal, temp;
        for (int i = 0; i < n; i++) {
            minimal = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minimal]) {
                    minimal = j;
                }
            }
            temp = a[i];
            a[i] = a[minimal];
            a[minimal] = temp;
        }
        return a;
    }
}
