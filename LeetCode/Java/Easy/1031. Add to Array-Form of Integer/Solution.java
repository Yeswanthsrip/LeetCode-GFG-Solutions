class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        long n=0;
        long m=1;
        for(int i=num.length-1;i>=0;i--){
            n +=num[i]*m;
            m=m*10;
        }
        System.out.println(n);
        n +=k;

        List<Integer> la=new ArrayList<>();
        while(n!=0){
            long t=n%10;
            la.addFirst((int)t);
            n=n/10;
        }
        return la;
    }
}