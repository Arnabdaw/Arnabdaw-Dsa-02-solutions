class Solution {
    public int trap(int[] height)
    {
        int n=height.length;
        int[] pref=fun1(height,n);
        int[] suff=fun2(height,n);

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+(Math.min(pref[i],suff[i])-height[i]);
        }
        return sum;
    }

    public int[] fun1(int[] arr,int n)
    {
        int[] x=new int[n];
        x[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            x[i]=Math.max(arr[i],x[i-1]);
        }
        return x;
    }

    public int[] fun2(int[] arr,int n)
    {
        int[] y=new int[n];
        y[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            y[i]=Math.max(arr[i],y[i+1]);
        }
        return y;
    }
}