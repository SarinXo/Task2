import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
         int[] arr = {14, 15, 16, 11, 12, 13};
        System.out.println(minElementInShiftedArr(arr));
    }

    /*Find the minimum element in an ordered array with a shift
     * @param sorted array with a shift or array of numbers
     * @return min element
     * time complexity O(log(n))
     * */
    public static int minElementInShiftedArr(int[] arr){
        return minElementInShiftedArr(arr, 0, arr.length-1);
    }

    private static int minElementInShiftedArr(int[] arr, int lBound, int rBound){
        int mid = (lBound + rBound) / 2;

        if(arr[lBound] < arr[rBound] || lBound == rBound)
            return arr[lBound];

        return min(minElementInShiftedArr(arr, lBound, mid),
                    minElementInShiftedArr(arr, mid+1, rBound));
    }
}