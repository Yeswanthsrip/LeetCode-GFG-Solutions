class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=0;
        int m=1;
        for(int i=num.length-1;i>=0;i--){
            n +=num[i]*m;
            m=m*10;
        }
        System.out.println(n);
        n +=k;

        List<Integer> la=new ArrayList<>();
        while(n!=0){
            int t=n%10;
            la.addFirst(t);
            n=n/10;
        }
        return la;
    }
}