class Solution {
    public boolean checkIfPangram(String sentence) {
        return isPangram(sentence);
    }
    public static boolean isPangram(String s1){
	    s1=s1.toLowerCase();
	    HashMap<Character,Integer> hm=new HashMap<>();
	    for(int i=0;i<s1.length();i++){
	        char ch=s1.charAt(i);
	        if(ch>='a' && ch<='z')
	            hm.put(ch,hm.getOrDefault(ch,0)+1);
	    }
	   // System.out.println(hm);
	    return (hm.size()==26)?true:false;
	}
}