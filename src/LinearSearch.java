public class LinearSearch {

    public int linearSearch(int[] arr, int target){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == target){
                System.out.println("Number found at index "+ i);
                return i;
            }
        }
        System.out.println("target "+ target + " Not found" );
        return -1;
    }
}
