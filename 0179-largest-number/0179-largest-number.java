class Solution 
{
    public String largestNumber(int[] nums)
    {
        int v=nums.length;
        String[] s=new String[v];
        for(int m=0;m<v;m+=1)
        {
            s[m]=String.valueOf(nums[m]);
        }
        for(int p=0;p<v-1;p+=1)
        {
            for(int q=p+1;q<v;q+=1)
            {
                String a=s[p]+s[q];
                String b=s[q]+s[p];
                if(a.compareTo(b)<0)
                {
                 String temp=s[p];
                 s[p]=s[q];
                 s[q]=temp;
                }
            }
        }
        if(s[0].equals("0"))
        {
            return "0";
        }
        StringBuilder ln=new StringBuilder();
        for(int i=0;i<v;i+=1)
        {
            ln.append(s[i]);
        }
        return ln.toString();
    }
}