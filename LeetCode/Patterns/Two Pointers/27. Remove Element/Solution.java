class Solution {
    public int removeElement(int[] arr, int target) {
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int k=0;k<n;k++){
            if(arr[k]!=target){
                al.add(arr[k]);
            }
        }
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return al.size();
    }
}