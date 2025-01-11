class Solution {
    public int maxVowels(String s, int k)
    {
        int max=0;
        int wvow=0;
        Set<Character>vowel=new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        for(int i=0;i<k;i++)
        {
            if(vowel.contains(s.charAt(i)))
            {
                wvow++;
            }
        }
        max=wvow;
        for(int j=k;j<s.length();j++)
        {
            if(vowel.contains(s.charAt(j)))
            {
                wvow++;
            }
            if(vowel.contains(s.charAt(j-k)))
            {
                wvow--;
            }
            max=Math.max(max,wvow);
            if(max==k)
            {
                break;
            }
        }
        return max;
    }
}