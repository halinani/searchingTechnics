import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{844,81,48,8,16,1,18,15,16,18,18};
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        BinarySearch search = new BinarySearch();
        search.bSearch(arr, 0);

        search.bSearchR(arr, 0, arr.length, 0);




    }
}