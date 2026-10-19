class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(nums[i]);
        }
        Arrays.sort(a);
        return String.valueOf(a[n-k]);
    }
}