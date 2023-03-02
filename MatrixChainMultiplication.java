public class MatrixChainMultiplication {
    static int MIN(int a , int b)
    {
        return a>b?a:b;
    }
    public static int MCM(int[] arr, int i, int j)
    {
        if(i==j) return 0;
        else
        {
            int min = Integer.MAX_VALUE;
         for(int k=i;k<j;k++)
         {
             int ans = MIN(MCM(arr,i,k),MCM(arr,k+1,j))+arr[i-1]*arr[k]*arr[j];
             if(ans<min)
                 min=ans;
         }
            return min;
        }

    }
    public static void main(String[] args) {
        System.out.println(MCM(new int[]{1, 2, 3,4,6},1,4));
    }
}
