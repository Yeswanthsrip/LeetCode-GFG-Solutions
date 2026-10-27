class Solution {
    public int missingNumber(int[] arr) {
        long n=arr.length;
        long la=0;
        for(int x:arr){
            la +=x;
        }
        return (int)(((n*(n+1))/2)-la);
    }
}