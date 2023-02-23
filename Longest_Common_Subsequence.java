public class Longest_Common_Subsequence {
    public static int lcs(String S1,String S2, int x, int y)
    {
        if (x==-1 || y==-1)
        {
            return 0;
        }
        else if(S1.charAt(x)==S2.charAt(y))
        {
            return lcs(S1,S2,x-1,y-2);
        }
        else {
            return Math.max(lcs(S1,S2,x,y-1),lcs(S1,S2,x-1,y));
        }
    }
    public static void main(String[] args)
    {
        System.out.println(lcs("abcdef","defabs",5,5));
    }
}
