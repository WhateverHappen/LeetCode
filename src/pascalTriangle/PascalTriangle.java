package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thanatos on 2017/10/2.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        System.out.println(result);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }
        pre.add(1);
        result.add(pre);

        for (int i = 1; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j=1;j<pre.size();j++){
                current.add(pre.get(j-1)+pre.get(j));
            }
            current.add(1);
            result.add(current);
            pre = current;
        }
        return result;
    }
}
