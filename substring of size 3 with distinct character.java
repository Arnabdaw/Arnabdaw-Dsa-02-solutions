class Solution {
    public int countGoodSubstrings(String s)
    {
        int n=s.length();
        if(n<3)
        {
            return 0;
        }
        int count=0;
        char p=s.charAt(0);
        char q=s.charAt(1);
        char r=s.charAt(2);

        for(int i=3;i<n;i++)
        {
            if((p!=q) &&(q!=r) && (r!=p))
            {
                count++;
            }
            p=q;
            q=r;
            r=s.charAt(i);
        }
        if((p!=q) &&(q!=r) && (r!=p))
        {
            count++;
        }
        return count;
    }
}