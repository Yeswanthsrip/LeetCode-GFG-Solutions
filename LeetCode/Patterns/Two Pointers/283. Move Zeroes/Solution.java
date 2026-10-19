class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        if(nums.length>1){
            while(j<nums.length){
                if(nums[i]==0 && nums[j]==0){
                    j++;
                }
                else if(nums[i]!=0){
                    i++;
                    j++;
                }
                else{
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    i++;
                    j++;
                }
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}