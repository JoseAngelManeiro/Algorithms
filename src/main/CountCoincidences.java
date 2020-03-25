package main;

/*
* We can count the coincidences in a list of numbers in an efficient way
* by making an array that allows us to count using the index that corresponds
* to the value of each number.
* The limitation of this technique is that the array
* where the coincidences are counted must be long enough,
* so we must know the maximum value.
* */
public class CountCoincidences {

    public int[] solution(int []a, int max) {
        int[] count = new int[max + 1];
        for (int k : a) {
            count[k] += 1;
        }
        return count;
    }
}