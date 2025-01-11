class Solution {
    public int nextGreaterElement(int n)
    {
        char arr[]=Integer.toString(n).toCharArray();
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i==-1)
        {
            return -1;
        }
        int k=arr.length-1;
        while(arr[k]<=arr[i])
        {
            k--;
        }
        swap(arr,i,k);
        Arrays.sort(arr,i+1,arr.length);

        long ans=Long.valueOf(new String(arr));
        return (ans>Integer.MAX_VALUE)?-1:(int)ans;
    }
    void swap(char[] arr,int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}