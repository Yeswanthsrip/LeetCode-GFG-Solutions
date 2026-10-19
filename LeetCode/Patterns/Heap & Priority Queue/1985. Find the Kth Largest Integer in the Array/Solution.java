class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseLong(nums[i]);
        }
        Arrays.sort(a);
        return String.valueOf(a[n-k]);
    }
}