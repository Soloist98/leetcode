import java.util.ArrayList;
import java.util.List;

public class LC_01_08 {
}
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> flag = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    flag.add(i);
                    flag.add(j);
                }
            }
        }
        for(int i = 0; i < flag.size(); i += 2){
            int r = flag.get(i);
            int c = flag.get(i+1);
            for(int j = 0; j < matrix[r].length; j++){
                matrix[r][j] = 0;
            }
            for(int j = 0; j < matrix.length; j++){
                matrix[j][c] = 0;
            }
        }
    }
}
