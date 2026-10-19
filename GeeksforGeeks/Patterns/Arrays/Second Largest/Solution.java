class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int fmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            fmax=Math.max(fmax,arr[i]);
        }
        int la=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=fmax){
                la=Math.max(la,arr[i]);
            }
        }
        return (la==Integer.MIN_VALUE)?-1:la;
    }
}