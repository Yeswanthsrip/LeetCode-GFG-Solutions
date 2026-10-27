class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int la[]=new int[n];
        int x=0;
        for(int i=n-k;i<n;i++){
            la[x++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            la[x++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=la[i];
        }

    }
}