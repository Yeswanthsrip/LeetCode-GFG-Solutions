class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int la=0;
        for(int x:arr){
            if(x%2==0)
                la=0;
            else
                la++;
            if(la==3)
                return true;
        }
        return false;
    }
}