class Solution {
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> ans=new ArrayList<>();
        int k=p.length();
        int n=s.length();
        if(n==0 || s==null || (n<k))
        {
            return ans;
        }
        int[] pfreq=new int[26];
        int[] sfreq=new int[26];

        for(int i=0;i<k;i++)
        {
            pfreq[p.charAt(i)-'a']++;
            sfreq[s.charAt(i)-'a']++;
        }
        for(int j=k;j<n;j++)
        {
            if(Arrays.equals(pfreq,sfreq))
            {
                ans.add(j-k);
            }
            sfreq[s.charAt(j)-'a']++;
            sfreq[s.charAt(j-k)-'a']--;
        }
        if(Arrays.equals(pfreq,sfreq))
        {
            ans.add(n-k);
        }
        return ans;
    }
}