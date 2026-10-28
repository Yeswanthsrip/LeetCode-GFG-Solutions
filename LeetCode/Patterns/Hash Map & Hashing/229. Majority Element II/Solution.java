class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=(int)(arr.length/3);
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }

            if(hm.get(x)>n){
                if(!li.contains(x)){
                    li.add(x);
                }
            }
        }
        return li;
    }
}