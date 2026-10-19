class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int i=1,j=0;
        while(i<n){
            if(arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}