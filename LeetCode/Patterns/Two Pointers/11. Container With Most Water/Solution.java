class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int la=0;
        while(i<j){
            int x=Math.min(height[i],height[j]);
            int t=j-i;
            int s=x*t;
            la=Math.max(la,s);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return la;
    }
}