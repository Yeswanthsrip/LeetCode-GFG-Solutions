class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        t.add(1);
        li.add(t);
        for(int i=2;i<=n+1;i++){
            List<Integer> x=new ArrayList<>();
            x.add(1);
            List<Integer> y=li.get(i-2);
            for(int j=1;j<i-1;j++){
                x.add(y.get(j-1)+y.get(j));
            }
            x.add(1);
            li.add(x);
        }
        // System.out.println(li);
        return li.get(n);
    }
}
