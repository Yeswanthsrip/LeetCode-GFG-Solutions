class Solution {
    public int nthDay(int d, int n) {
        int a[]={0,1,2,3,4,5,6};
        n=n%7;
        int k=d;
        for(int i=0;i<n;i++){
            if(k==0){
                k=6;
                continue;
            }
            k--;
        }
        return k;
    }
}