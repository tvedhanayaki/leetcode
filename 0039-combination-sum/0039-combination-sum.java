class Solution {
     public void solve(int[] c,int t,List<List<Integer>> res,List<Integer> list,int i)
    {
        if(t==0)
        {
           res.add(new ArrayList<>(list)); 
           return;
        } 
        if(i==c.length || t<0 )
        {
            return;
        }
        else 
        {
            list.add(c[i]); 
            solve(c,t-c[i],res,list,i); 
            list.remove(list.size()-1);  
            solve(c,t,res,list,i+1);

        }
    }
    public List<List<Integer>> combinationSum(int[] c, int t)
    {
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> list = new ArrayList<>(); 
        solve(c,t,res,list,0); 
        return res;
    }
}