class Solution {
    int majorityElement(int arr[]) {
        int n=arr.length;
        int mid=(int)Math.floor(n/2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            Integer k=e.getKey();
            Integer v=e.getValue();
            if(v>mid){
                return k;
            }
        }
        return -1;
    }
}