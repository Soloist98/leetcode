import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_498 {
}

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < matrix.length + matrix[0].length - 1) {
            int x1 = i < matrix.length ? i : matrix.length - 1;
            int y1 = i - x1;
            while(x1 >= 0 && y1 < matrix[0].length){
                res.add(matrix[x1][y1]);
                x1--;
                y1++;
            }
            i++;

            if(i >= matrix.length + matrix[0].length - 1)
                break;
            y1 = i < matrix[0].length ? i : matrix[0].length - 1;
            x1 = i - y1;
            while(y1 >=0 && x1 < matrix.length){
                res.add(matrix[x1][y1]);
                x1++;
                y1--;
            }
            i++;
        }
        int[] r = new int[res.size()];
        int k = 0;
        for(Integer a : res){
            r[k++] = a;
        }
        return r;
    }
}
