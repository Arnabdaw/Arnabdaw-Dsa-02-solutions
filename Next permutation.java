class Solution {
    public void nextPermutation(int[] nums)
    {
        int size=nums.length;
        int idx=-1;
        for(int i=size-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            reverse(nums,0,size-1);
        }
        else
        {
            int j=size-1;
            while(nums[j]<=nums[idx-1])
            {
                j--;
            }
            swap(nums,idx-1,j);
            reverse(nums,idx,size-1);
        }
    }
    public void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public void reverse(int arr[],int st,int end)
    {
        while(st<end)
        {
            swap(arr,st,end);
            st++;end--;
        }
    }
}