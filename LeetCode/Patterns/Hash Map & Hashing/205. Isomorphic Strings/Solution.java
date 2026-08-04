class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> hm=new HashMap<>();
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(hm.containsKey(ch1[i])){
                if(hm.get(ch1[i])!=ch2[i]){
                    return false;
                }
            }
            else{
                hm.put(ch1[i],ch2[i]);
            }
        }
        System.out.println(hm);
        HashMap<Character,Character> hm1=new HashMap<>();
        ch1=t.toCharArray();
        ch2=s.toCharArray();
        for(int i=0;i<n;i++){
            if(hm1.containsKey(ch1[i])){
                if(hm1.get(ch1[i])!=ch2[i]){
                    return false;
                }
            }
            else{
                hm1.put(ch1[i],ch2[i]);
            }
        }














        
        // char ch[]=new char[26];
        // int ia[]=new int[10];
        // for(int i=0;i<10;i++){
        //     ia[i]=-1;
        // }
        // char ch1[]=s.toCharArray();
        // char ch2[]=t.toCharArray();
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     if(Character.isLetter(ch1[i])){
        //         if(ch[ch1[i]-'a']=='\u0000'){
        //             ch[ch1[i]-'a']=ch2[i];
        //         }
        //         else{
        //             if(ch[ch1[i]-'a']!=ch2[i]){
        //                 return false;
        //             }
        //         }
        //     }
        //     else{
        //         if(ia[ch1[i]-'0']==-1){
        //             ia[ch1[i]-'0']=ch2[i];
        //         }
        //         else{
        //             if(ia[ch1[i]-'0']!=ch2[i]){
        //                 return false;
        //             }
        //         }
        //     }
        //     System.out.println(91);
        // }
        // for(int i=0;i<10;i++){
        //     ia[i]=-1;
        // }
        // for(int i=0;i<26;i++){
        //     ch[i]='\u0000';
        // }
        // ch1=t.toCharArray();
        // ch2=s.toCharArray();
        // for(int i=0;i<n;i++){
        //     if(Character.isLetter(ch1[i])){
        //         if(ch[ch1[i]-'a']=='\u0000'){
        //             ch[ch1[i]-'a']=ch2[i];
        //         }
        //         else{
        //             if(ch[ch1[i]-'a']!=ch2[i]){
        //                 return false;
        //             }
        //         }
        //     }
        //     else{
        //         if(ia[ch1[i]-'0']==-1){
        //             ia[ch1[i]-'0']=ch2[i];
        //         }
        //         else{
        //             if(ia[ch1[i]-'0']!=ch2[i]){
        //                 return false;
        //             }
        //         }
        //     }
        //     System.out.println(91);
        // }
        return true;
    }
}