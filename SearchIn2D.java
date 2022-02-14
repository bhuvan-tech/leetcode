import java.util.Arrays;
public class SearchIn2D{
    public static void main(String[] args){
        int[][] twoD ={
            {1,2,3,4},
            {5,6},
            {7,3,6},
            {19}
        };

        int tar=10;
        int[] ans = TwoDSearch(twoD,tar);
        //System.out.println(TwoDSearch(twoD,tar));
        System.out.println(Arrays.toString(ans));
    }

    // static boolean TwoDSearch(int[][] twoD,int target){
    //     for(int i=0;i<twoD.length;i++){
    //         for(int j=0;j < twoD[i].length;j++)
    //             if(twoD[i][j] == target)
    //                 return true;;
    //     }
    // return false;
    // }

    static int[] TwoDSearch(int[][] twoD,int target){
        for(int row=0;row<twoD.length;row++)
            for(int col=0; col< twoD[row].length; col++)
                if(twoD[row][col] == target)
                    return new int[]{row,col};
    return new int[]{-1,-1};
    }
}