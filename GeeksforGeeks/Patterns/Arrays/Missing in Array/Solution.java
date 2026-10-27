class Solution {
    int missingNum(int arr[]) {
        long n=arr.length+1;
        long la=0;
        for(int x:arr){
            la +=x;
        }
        return (int)(((n*(n+1))/2)-la);
        
    }
}