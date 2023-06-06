class Solution {
    public static int equalPairs(int[][] grid) {
		// int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		int count = 0;
		List<StringBuilder> rows = new ArrayList<>();
		IntStream.range(0, grid.length).forEach(i -> rows.add(new StringBuilder()));
		List<StringBuilder> cols = new ArrayList<>();
		IntStream.range(0, grid.length).forEach(i -> cols.add(new StringBuilder()));
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				rows.get(i).append(grid[i][j]+",");
				cols.get(j).append(grid[i][j]+",");
			}
		}
		List<String> row = new ArrayList<>();
		List<String> col = new ArrayList<>();
		rows.stream().forEach(sb -> row.add(sb.toString()));
		cols.stream().forEach(sb -> col.add(sb.toString()));
        Collections.sort(row);
		Collections.sort(col);
		// System.out.println(row);
		// System.out.println(col);
		for (String string : row) {
			if(col.contains(string)){
				count+=col.lastIndexOf(string) - col.indexOf(string)+1;
			}
		}
		// System.out.println(count);
		return count;
	}
}