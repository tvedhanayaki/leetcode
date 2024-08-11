class Solution {
    public void solve(int[] nums,List<Integer> list,List<List<Integer>> result,int i,int k)
    {// i =3 
        if(i==nums.length  )
        {
            if(list.size()==k)
            {
              result.add(new ArrayList<>(list));
            }
           return;
        } 
        
        else
        {
            list.add(nums[i]); 
            solve(nums,list,result,i+1,k); 
            list.remove(list.size()-1); 
             solve(nums,list,result,i+1,k); 
        }

    }
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> list = new ArrayList<>(); 
        int[] nums  = new int[n]; 
        for(int i=0;i<n;i++)
        {
            nums[i] = i+1;
        } 
        solve(nums,list,result,0,k); 
        return result;
    }
}