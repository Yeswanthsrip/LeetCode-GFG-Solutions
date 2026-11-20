class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[]=sentence.toCharArray();
        int a[]=new int[26];
        for(char x:ch){
            a[x-'a']=1;
        }
        for(int x:a){
            if(x==0)
                return false;
        }
        return true;
    }
}