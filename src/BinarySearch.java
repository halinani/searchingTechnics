import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {


    public int bSearch(int[] arr, int num){
        int left = 0;
        int right = arr.length -1;


        while(left <= right){
            int mid = (right + left) /2;
            if(num == arr[mid]){
                System.out.println(num+" found at index "+mid);
                return mid;
            }else if(num < arr[mid]){
                right = mid-1;
            }else if(num > arr[mid]){
                left = mid+1;
            }
        }
        System.out.println(num+" is not found in the array");
        return -1;
    }


}
