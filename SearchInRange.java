public class SearchInRange{
    public static void main(String[] args){
        String str="Hey bruh whatsupp!";
        char key='b';
        System.out.println(searchRange(str,key,3,6));
    }

    static boolean searchRange(String str,char key, int start ,int end){
        for(int i=start;i<end;i++)
            if(str.charAt(i) == key)
                return true;
        return false;
    } 
}