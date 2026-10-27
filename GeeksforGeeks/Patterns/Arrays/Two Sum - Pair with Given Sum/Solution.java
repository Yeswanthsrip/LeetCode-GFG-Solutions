class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            if(hs.contains(target-x)){
                return true;
            }
            hs.add(x);
        }
        return false;
    }
}