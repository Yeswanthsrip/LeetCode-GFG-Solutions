class Solution {
    public int[] twoSum(int[] arr, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:arr){
            al.add(x);
        }
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                break;
            }
            if(arr[i]+arr[j]>=k){
                j--;
            }
            else{
                i++;
            }
        }
        if(i==j)
            return new int[]{-1,-1};
        return new int[]{al.indexOf(arr[i]),al.lastIndexOf(arr[j])};
    }
}