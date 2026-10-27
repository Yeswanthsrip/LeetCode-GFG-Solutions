class Solution {
    public int maxConsecBits(int[] arr) {
        int n=arr.length;
        int la=0;
        int c0=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c++;
            }
            else{
                c0=Math.max(c0,c);
                c=0;
            }
        }
        c0=Math.max(c0,c);
        int c1=0;
        c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
            }
            else{
                c1=Math.max(c1,c);
                c=0;
            }
        }
        c1=Math.max(c1,c);
        return Math.max(c0,c1);
    }
}
