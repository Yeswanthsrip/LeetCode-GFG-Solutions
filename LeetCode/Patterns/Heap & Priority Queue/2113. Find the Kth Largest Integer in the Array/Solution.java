class sortNums implements Comparator<String>{
    public int compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return s2.length()-s1.length();
        }
        return s2.compareTo(s1);
    }
}
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums,new sortNums());
        return nums[k-1];
    }
}