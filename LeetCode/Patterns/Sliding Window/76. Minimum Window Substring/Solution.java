class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char x:t.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        // System.out.println(hm);
        ArrayList<Character> al=new ArrayList<>();
        int la=0;
        int pi=-1,pj=-1;
        int i=0,j=0;
        int n=s.length();
        HashMap<Character,Integer> thm=new HashMap<>();
        char ch[]=s.toCharArray();
        while(j<n){
            if(al.size()==t.length()){
                if((j-i)<(pj-pi)){
                    pi=i;
                    pj=j;
                }
                while(!(al.size()!=t.length())){
                    thm.put(ch[i],thm.getOrDefault(ch[i],0)-1);
                    if(thm.get(ch[i])==0)
                        thm.remove(ch[i]);
                    if(hm.containsKey(ch[i])){
                        al.remove(Character.valueOf(ch[i]));
                    }
                    i++;
                    if(al.size()==t.length()){
                        if(pi==-1 && pj==-1){
                            pi=i;
                            pj=j;
                        }
                        else if((j-i)<(pj-pi)){
                            pi=i;
                            pj=j;
                        }
                    }
                }
                while(i<n && !al.contains(ch[i])){
                    thm.put(ch[i],thm.getOrDefault(ch[i],0)-1);
                    i++;
                    if(al.size()==t.length()){
                        if(pi==-1 && pj==-1){
                            pi=i;
                            pj=j;
                        }
                        else if((j-i)<(pj-pi)){
                            pi=i;
                            pj=j;
                        }
                    }
                }
            }
            else{
                if(hm.containsKey(ch[j])){
                    al.add(ch[j]);
                }
                if(al.size()==t.length()){
                    if(pi==-1 && pj==-1){
                        pi=i;
                        pj=j;
                    }
                    else if((j-i)<(pj-pi)){
                        pi=i;
                        pj=j;
                    }
                }
                thm.put(ch[j],thm.getOrDefault(ch[j],0)+1);
                j++;
            }
            System.out.println("i "+i+" j "+j);
            System.out.println("pi "+pi+" pj "+pj);
            System.out.println(al);
            System.out.println(thm);
            System.out.println("................................");
        }
        if(pi==-1)
            return "";
        StringBuffer sb=new StringBuffer();
        for(int x=pi;x<=pj;x++){
            sb.append(String.valueOf(ch[x]));
        }
        return sb.toString();
        
    }
}