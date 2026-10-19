class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        List<ArrayList<Integer>> li=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(1);
        li.add(t);
        for(int i=2;i<=n;i++){
            ArrayList<Integer> x=new ArrayList<>();
            x.add(1);
            List<Integer> y=li.get(i-2);
            for(int j=1;j<i-1;j++){
                x.add(y.get(j-1)+y.get(j));
            }
            x.add(1);
            li.add(x);
        }
        return li.get(n-1);
    }
}