class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        int m=a.length,n=b.length;
        int i=0,j=0;
        ArrayList<Integer> la=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        while(i<m && j<n){
            if(a[i]==b[j]){
                if(!hs.contains(a[i])){
                    la.add(a[i]);
                    hs.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return la;
    }
}