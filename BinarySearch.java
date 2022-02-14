public class BinarySearch{
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1}; 
        int res=binarySearch(arr,8);
        System.out.println(res);
    }

    static int binarySearch(int[] arr,int key){
        int end=arr.length-1, start=0;
        int mid=0;
    // Order-Agnostic Binary Search
        boolean isAsc  = arr[start] < arr[end];
        while(start <= end){
            // System.out.println(mid);
            mid = start+(end-start)/2;
            if(arr[mid] == key)
                return mid;

            if(isAsc){
                if(arr[mid] > key)
                    end=mid-1;
                else if(arr[mid] < key)
                    start = mid+1; 
            }
            else{
                if(arr[mid] < key)
                    end=mid-1;kk
                else if(arr[mid] > key)
                    start = mid+1; 
            }
            

        }
        return -1;
    }
}