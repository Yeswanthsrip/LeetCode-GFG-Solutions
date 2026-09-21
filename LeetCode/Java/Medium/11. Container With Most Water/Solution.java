class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int la=0;
        while(i<j){
            int s=Math.min(height[i],height[j])*(j-i);
            la=Math.max(la,s);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return la;
    }
}