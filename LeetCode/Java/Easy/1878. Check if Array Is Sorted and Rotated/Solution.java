class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int i=0;
        int c=0;
        for(i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                c++;
            }
        }
        if(c==0)
            return true;
        if(c>1)
            return false;
        return (nums[0]>=nums[n-1])?true:false;
    }
}