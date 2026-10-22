class Solution {
    public int mostWordsFound(String[] sentences) {
        // char ch[]=sentences.toCharArray();
        int la=0;
        for(String x:sentences){
            System.out.println(x);
            char ch[]=x.toCharArray();
            int t=1;
            for(char y:ch){
                if(Character.isWhitespace(y)){
                    t++;
                }
            }
            la=Math.max(la,t);
        }
        return la;
    }
}