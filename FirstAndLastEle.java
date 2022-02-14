import java.util.Arrays;
class FirstAndLastEle {
    static int[] searchRange(int[] nums, int target) {
        int[] arr ={-1,-1};
        
        arr[0]=search(nums, target, true);
        arr[1]=search(nums, target, false);
        
        return arr;
    }
    
    static int search(int[] nums, int target, boolean findfirst){
        int start = 0, end= nums.length-1,ans=-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] > target){
                end = mid - 1; 
            }
            else if(nums[mid] < target)
                start = mid + 1;
            else{
                ans = mid;
                if(findfirst == true)
                    end = mid-1;
                else
                    start  = mid+1;
            }
                
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums={5,7,7,7,7,8,9,23,34};
        int[] ans=new int[1];
        ans=searchRange(nums,7);
        System.out.println(Arrays.toString(ans));
    }
}