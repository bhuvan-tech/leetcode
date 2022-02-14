public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");

    int[] arr={18,12,9,14,77,50};
    
    System.out.println("element found at position "+linearSearch(arr,14));
	}
	
	static int linearSearch(int arr[], int key){
	    if(arr.length == 0)
	        return -1;
	        
	    for(int i=0;i<arr.length;i++)
	        if(arr[i] == key)
	            return i+1;
	    return -1;
	}
}
