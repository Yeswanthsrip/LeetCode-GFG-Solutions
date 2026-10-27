class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int la=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
            }
            else{
                la=Math.max(la,c);
                c=0;
            }
        }
        la=Math.max(la,c);
        return la;
    }
}