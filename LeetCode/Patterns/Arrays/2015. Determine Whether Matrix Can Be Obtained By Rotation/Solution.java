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
        //1st
        int l1=n*n;
        int l2=l1,l3=l1,l4=l1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(start[i][j]==goal[n-j-1][i]){
                    l1--;
                }
                if(start[i][j]==goal[j][n-i-1]){
                    l2--;
                }
                if(start[i][j]==goal[n-i-1][n-j-1]){
                    l3--;
                }
                if(start[i][j]==goal[n-i-1][j]){
                    l4--;
                }
            }
        }
        if(l1==0 || l2==0 || l3==0 || l4==0)
            return true;
        //2nd
        // l=n*n;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(start[i][j]==goal[j][n-i-1]){
        //             l--;
        //         }
        //     }
        // }
        // if(l==0)
        //     return true;
        // //3rd
        // l=n*n;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(start[i][j]==goal[n-i-1][n-j-1]){
        //             l--;
        //         }
        //     }
        // }
        // if(l==0)
        //     return true;
        // //4th
        // l=n*n;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(start[i][j]==goal[n-i-1][j]){
        //             l--;
        //         }
        //     }
        // }
        // if(l==0)
        //     return true;
        return false;
    }
}