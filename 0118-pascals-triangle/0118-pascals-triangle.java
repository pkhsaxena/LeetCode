class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triag = new ArrayList<>();
    triag.add(Arrays.asList(1));
    if(numRows == 1)
        return triag;
    triag.add(Arrays.asList(1,1));
    if(numRows == 2)
        return triag;
    for(int i=3;i<=numRows;i++){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int j=1;j<i-1;j++){
            row.add(triag.get(i-2).get(j-1)+triag.get(i-2).get(j));
        }
        row.add(1);
        triag.add(row);
    }
    return triag;
    }
}