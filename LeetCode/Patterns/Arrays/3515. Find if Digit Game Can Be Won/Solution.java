class Solution {
    public boolean canAliceWin(int[] nums) {
        int sSum=0;
        int dSum=0;
        for(int x:nums){
            if(x<10){
                sSum +=x;
            }
            else if(x<100)
                dSum +=x;
        }
        if(sSum>dSum || dSum>sSum)
            return true;
        return false;
    }
}