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

    public int bSearchR(int[] arr, int left, int right, int value){
        int mid = (left+right)/2;
        if(left < right){
            if(value == arr[mid]){
                System.out.println(value+" found at "+ mid +" index");
                return mid;
            }else if(value < arr[mid]){
                return bSearchR(arr,left,mid -1, value );
            }else{
                return bSearchR(arr,mid +1,right, value);
            }
        }
        System.out.println(value+" not found");
        return -1;
    }


}
