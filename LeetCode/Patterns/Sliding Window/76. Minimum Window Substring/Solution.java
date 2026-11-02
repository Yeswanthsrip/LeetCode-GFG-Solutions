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
            // while(i<n && !chm.containsKey(ch[i])){
            //     // if(thm.containsKey(ch[i])){
            //         thm.put(ch[i],thm.getOrDefault(ch[i],0)-1);
            //         if(thm.get(ch[i])==0)
            //             thm.remove(ch[i]);
            //     // }
            //     i++;
            // }
            // if(hm.containsKey(ch[j])){
            //     // al.add(ch[j]);
            //     chm.put(ch[j],chm.getOrDefault(ch[j],0)+1);
            // }
            
            // j++;
            // if(chm.size()==hm.size() && chm.get(ch[j])==hm.get(ch[j])){
            //     j++;
            //     if(pi==-1 || (j-i)<(pj-pi)){
            //         pi=i;
            //         pj=j;
            //     }
            // }
            // else
            //     j++;
        // System.out.println("i "+i+" j "+j);
        // System.out.println("pi "+pi+" pj "+pj);
        // System.out.println(chm);
        // System.out.println(thm);
        // System.out.println("................................");
        }
        if(pi==-1)
            return "";
        StringBuffer la=new StringBuffer();
        for(int x=pi;x<pj;x++){
            la.append(String.valueOf(ch[x]));
        }
        return la.toString();
        
    }
}