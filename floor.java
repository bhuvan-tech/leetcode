public class floor{
    public static void main(String[] args){
        int[] arr={2,4,6,8,16,19,20,27,38};
        int pos=floor_num(arr,25);
        System.out.println(pos+1);
    }

    static int floor_num(int[] arr, int target){
        int start=0,end=arr.length-1;
        int mid;
        while(start <= end){
            // System.out.println(start);
            mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] < target)
                start=mid+1;
            else
                end=mid-1;
        }
        return end;
    }
}