class Solution {
    public String reverseWords(String s) {
        char ch[] = s.toCharArray();
        List<String> list = new ArrayList<>();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(ch[i]!=' '){
             s1+=ch[i];
            }
            else{
            if(!s1.isEmpty()){
                list.add(s1);
                s1="";
            }
            }
        }
        if(!s1.isEmpty()){
            list.add(s1);
        }
        String st="";
        for(int j=list.size()-1;j>0;j--){
           st+= (list.get(j)+" ");
        }
        st+=list.get(0);
        return st;
    }
}