class Solution {
    public boolean findRotation(int[][] start, int[][] goal) {
        int n=start.length;
        int l=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(start[i][j]==goal[i][j]){
                    l--;
                }
            }
        }
        if(l==0)
            return true;
        boolean la1=true,la2=true,la3=true,la4=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(la1 && start[i][j]!=goal[n-j-1][i]){
                    la1=false;
                }
                if(la2 && start[i][j]!=goal[j][n-i-1]){
                    la2=false;
                }
                if(la3 && start[i][j]!=goal[n-i-1][n-j-1]){
                    la3=false;
                }
                if(la4 && start[i][j]!=goal[n-i-1][j]){
                    la4=false;
                }
            }
        }
        return la1 || la2 || la3 || la4;
    }
}