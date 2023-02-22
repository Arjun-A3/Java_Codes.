public class LPS {
    public static int max(int a , int b)
    {
        return (a>b)?a:b;
    }
    public static int  LPS (String s,int start , int end)
    {
        if(start>=end)
        {
            return 1;
        }
        if(s.charAt(start)==s.charAt(end))
        {
            return LPS(s,start+1,end-1)+2;
        }
        else {
            return max(LPS(s,start,end-1),LPS(s,start+1,end));
        }
    }
    public static void main(String[] args)
    {
        System.out.println(LPS("ABCAB",0,4));
    }
}
