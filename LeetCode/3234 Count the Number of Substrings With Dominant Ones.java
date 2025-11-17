import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numberOfSubstrings(String s) {
        List<Integer> zero = new ArrayList<>();
        zero.add(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero.add(i);
            } else {
                result += i - zero.get(zero.size() - 1);
            }
            for (int j = 1; j < zero.size(); j++) {
                int len = j * (j + 1);
                if (len > i + 1) {
                    break;
                }
                int prev = zero.get(zero.size() - j - 1);
                int from = Math.min(i - len + 1, zero.get(zero.size() - j));
                if (from > prev) {
                    result += from - prev;
                }
            }
        }
        return result;
    }
}