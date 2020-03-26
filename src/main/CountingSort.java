package main;

/*
* This algorithm is based on the technique of counting coincidences.
* Because of this, the limitation of this technique is that the array
* where the coincidences are counted must be long enough,
* so we must know the maximum value.
* Time complexity -> O(n + m)
* */
public class CountingSort {

    public int[] solution(int []a, int max) {
        int[] count = new int[max + 1];
        for (int k : a) {
            count[k] += 1;
        }

        int p = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[p] = i;
                p++;
            }
        }
        return a;
    }
}
