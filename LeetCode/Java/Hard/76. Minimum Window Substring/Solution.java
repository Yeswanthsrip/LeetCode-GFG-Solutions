class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";

        HashMap<Character,Integer> hm=new HashMap<>();

        for(char x:t.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        int pi=-1,pj=-1;
        int i=0,j=0;
        int n=s.length();

        HashMap<Character,Integer> thm=new HashMap<>();
        HashMap<Character,Integer> chm=new HashMap<>();

        char ch[]=s.toCharArray();

        while(j<n){

            thm.put(ch[j],thm.getOrDefault(ch[j],0)+1);

            if(hm.containsKey(ch[j])){
                if(thm.get(ch[j])>=hm.get(ch[j])){
                    chm.put(ch[j],1);
                }
            }

            j++;

            while(chm.size()==hm.size()){

                if(pi==-1 || (j-i)<(pj-pi)){
                    pi=i;
                    pj=j;
                }

                thm.put(ch[i],thm.get(ch[i])-1);

                if(hm.containsKey(ch[i])){
                    if(thm.get(ch[i])<hm.get(ch[i])){
                        chm.remove(ch[i]);
                    }
                }

                if(thm.get(ch[i])==0)
                    thm.remove(ch[i]);

                i++;
            }
        }

        if(pi==-1)
            return "";

        return s.substring(pi,pj);
    }
}