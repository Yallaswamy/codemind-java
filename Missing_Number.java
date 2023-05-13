import  java.util.*;
public class ma{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            ar[i]=sc.nextInt();
            s+=ar[i];
        }
        int m=(n*(n+1))/2;
        System.out.println(m-s);
    }
}