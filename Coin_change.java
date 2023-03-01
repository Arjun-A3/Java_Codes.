public class Coin_change {
    public static int p=0;
    public static void CC(int[] arr, int s, int t,int sum)
    {
        if(sum==t)
        {
            p++;
            return;
        }
        else if(sum<t)
        {
            for(int i=0;i<s;i++)
            {
                CC(arr,s,t,sum+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        CC(new int[]{1,2,3},3,5,0);
        System.out.println(p);

    }
}
