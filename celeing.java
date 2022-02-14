public class celeing{
    public static void main(String[] args){
        int[] arr= {2,4,7,9,14};
        int pos=celeingnum(arr,8);
        System.out.println(pos+1);
    }

    static int celeingnum(int[] arr, int target){
        if(target > arr[arr.length-1])
                return -1;
        int start=0,end=arr.length-1;
        int mid=0;
        while(start <= end){
            // System.out.println(start);
            
            mid =  start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] < target)
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}