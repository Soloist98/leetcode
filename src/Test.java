import java.util.HashSet;
import java.util.Set;

public class Test {
    public static boolean isHappy(int n) {
        for(int i = 0; i < 100 ; i++){
            if(n == 1){
                return true;
            }else{
                int res = 0;
                while(n % 10 != 0){
//                    res = 0;
                    res += (n % 10) * (n % 10);
                    n = n / 10;
                }
                n = res;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         isHappy(19);
    }
}
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for(int i : arr) {
            if(i == 0){
                if(s.contains(i)){
                    return true;
                }else{
                    s.add(i);
                }
            }else {
                if(s.contains(i * 2)|| i % 2 == 0 && s.contains(i/2)){
                    return true;
                }
            }
        }
        return false;
    }
}