class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> la=new ArrayList<>();
        for(int i=n-1;i>=n-k;i--){
            la.add(arr[i]);
        }
        return la;
    }
}
