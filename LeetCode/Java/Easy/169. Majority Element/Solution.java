class Solution {
    public int majorityElement(int[] arr) {
        int n=(int)(arr.length/2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }
            if(hm.get(x)>n)
                return x;
        }
        return -1;
    }
}