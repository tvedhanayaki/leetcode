class Solution {
    public int[] decode(int[] encoded) {
       int n=encoded.length+1;
       int a=0;
       for(int i=1;i<=n;i++){
        a^=i;
       }
       int b=0;
       for(int i=1;i<n;i+=2){
        b^=encoded[i];
       }
       int[] res=new int[n];
       res[0]=a^b;
       for(int i=1;i<n;i++){
        res[i]=res[i-1]^encoded[i-1];
       }
return res;
    }
}