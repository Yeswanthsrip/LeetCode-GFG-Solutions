class Solution {
    public boolean findRotation(int[][] start, int[][] goal) {
        int n=start.length;
        //1st
        int l=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // System.out.println(start.get(i).get(j)+" "+goal.get(n-j-1).get(i));
                if(start[i][j]==goal[n-j-1][i]){
                    l--;
                }
            }
        }
        if(l==0)
            return true;
        //2nd
        l=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // System.out.println(start.get(i).get(j)+" "+goal.get(n-j-1).get(i));
                if(start[i][j]==goal[j][n-i-1]){
                    l--;
                }
            }
        }
        if(l==0)
            return true;
        //3rd
        l=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // System.out.println(start.get(i).get(j)+" "+goal.get(n-i-1).get(j));
                if(start[i][j]==goal[n-i-1][n-j-1]){
                    l--;
                }
            }
        }
        if(l==0)
            return true;
        //4th
        l=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // System.out.println(start.get(i).get(j)+" "+goal.get(n-i-1).get(j));
                if(start[i][j]==goal[n-i-1][j]){
                    l--;
                }
            }
        }
        if(l==0)
            return true;
        return false;
    }
}