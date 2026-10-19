class Solution {
    int single(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return 91;
    }
}