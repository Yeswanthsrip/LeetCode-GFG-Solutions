class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int fe=nums[0];
        int i=0;
        for(i=1;i<n;i++){
            if(nums[i]<fe){
                break;
            }
        }
        if(i==n)
            return true;
        return (fe>nums[n-1])?true:false;
    }
}