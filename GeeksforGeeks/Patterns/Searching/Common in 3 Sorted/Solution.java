class Solution {
    public ArrayList<Integer> commonElements(int[] nums1, int[] nums2, int[] nums3) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=nums3.length;
        ArrayList<Integer> la=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(nums1[i]==nums2[j] && nums2[j]==nums3[k]){
                if(!hs.contains(nums1[i])){
                    la.add(nums1[i]);
                    hs.add(nums1[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(nums1[i]<=nums2[j] && nums1[i]<=nums3[k]){
                i++;
            }
            else if(nums2[j]<=nums1[i] && nums2[j]<=nums3[k]){
                j++;
            }
            else{
                k++;
            }
            // System.out.println(i+" "+j+" "+k);
        }
        return la;
    }
}