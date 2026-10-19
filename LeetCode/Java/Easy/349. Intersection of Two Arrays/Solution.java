class Solution {
    public int[] intersection(int[] a, int[] b) {
        int m=a.length,n=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        while(i<m && j<n){
            if(a[i]==b[j]){
                if(!hs.contains(a[i])){
                    al.add(a[i]);
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
        int la[]=new int[al.size()];
        for(i=0;i<al.size();i++){
            la[i]=al.get(i);
        }
        return la;
    }
}