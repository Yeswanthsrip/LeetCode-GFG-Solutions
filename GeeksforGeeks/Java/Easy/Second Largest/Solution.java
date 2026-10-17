class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int t=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=t)
                return arr[i];
        }
        return -1;
    }
}