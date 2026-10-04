class Solution {
    public long maximumSubarraySum(int[] a, int k) {
        int n=a.length;
        long la=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        long s=0;
        for(int i=0;i<k;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            s +=a[i];
        }
        // System.out.println(hm);
        if(hm.size()==k){
            la=s;
        }
        // System.out.println(la);
        for(int i=1;i<=n-k;i++){
            hm.put(a[i+k-1],hm.getOrDefault(a[i+k-1],0)+1);
            hm.put(a[i-1],hm.get(a[i-1])-1);
            if(hm.get(a[i-1])==0){
                hm.remove(a[i-1]);
            }
            // System.out.println(hm);
            // int s=0;
            s +=a[i+k-1];
            s -=a[i-1];
            if(hm.size()==k){
                la=Math.max(la,s);
            }
            // System.out.println(la);
        }
        return la;
    }
}