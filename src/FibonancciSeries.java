//Program for Fabonacci Series
class FibonancciSeries
{
    public static void main(String args[])
    {
        System.out.println("Fabonacci series is given below ");
        int n1=0,n2=1,n3,count=10;
        System.out.print(n1+""+n2);
        for(int i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(""+n3);
            n1=n2;
            n2=n3;
        }
    }

}
