class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold)
    {
        int count=0;
        int n=arr.length;
        int sum=0;
        int x=threshold*k;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if(sum>=x)
        {
            count++;
        }
        for(int j=k;j<n;j++)
        {
            sum+=arr[j]-arr[j-k];
            if(sum>=x)
            {
                count++;
            }
        }
        return count;
    }
}
