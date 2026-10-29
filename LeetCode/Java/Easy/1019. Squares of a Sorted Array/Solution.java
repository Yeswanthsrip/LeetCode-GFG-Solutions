class Solution {
    public int[] sortedSquares(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            int x=a[i]*a[i];
            int y=a[j]*a[j];
            if(x>y){
                b[k--]=x;
                i++;
            }
            else{
                b[k--]=y;
                j--;
            }
        }
        return b;
    }
}