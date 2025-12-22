class Solution {
    public List<List<Integer>> generate(int numRows) {

        int[][] arr = new int[numRows][numRows];
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                row.add(arr[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}
