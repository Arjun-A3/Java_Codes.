public class PrimeNumbersSieveOfEratosthenes {
    public static void SOE(int n)
    {
        boolean[] Soe = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            Soe[i]=true;
        }
        for(int p=2;p*p<=n;p++)
        {
            if(Soe[p]==true)
            {
                for(int i=p*p;i<=n;i+=p)
                {
                  Soe[i]=false;
                }
            }
        }
        for(int i =2;i<n;i++)
        {
            if(Soe[i]==true)
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        SOE(100);
    }
}
