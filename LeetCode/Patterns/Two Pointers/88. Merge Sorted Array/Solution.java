class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
    	int c[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k++]=a[i];
                i++;
            }
            else{
                c[k++]=b[j];
                j++;
            }
        }
        while(i<m){
            c[k++]=a[i];
            i++;
        }
        while(j<n){
            c[k++]=b[j];
            j++;
        }
        for(int x=0;x<m+n;x++){
            a[x]=c[x];
        }
    }
}