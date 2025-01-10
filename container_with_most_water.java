class Solution
{
    public int maxArea(int[] height)
    {
        int max=Integer.MIN_VALUE;
        int n=height.length;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            int minheight=Math.min(height[l],height[r]);
            int area=(r-l)*minheight;
            if(area>max)
            {
                max=area;
            }
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}