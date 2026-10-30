class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int la=0;
        for(int x:hours){
            if(x>=target)
                la++;
        }
        return la;
    }
}