class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int x:nums)
            s +=x;
        int n=nums.length;
        int os=(n*(n+1))/2;
        return os-s;
    }
}