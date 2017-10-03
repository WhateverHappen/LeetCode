package pascalTriangle2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thanatos on 2017/10/3.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<Integer> result = getRow(3);
        System.out.println(result);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        if (rowIndex == 0) {
            return result;
        }
        result.add(1);
        if(rowIndex==1){
            return result;
        }

        for (int i = 2; i <= rowIndex; i++) {
            result.add(1);
            for(int j=i-1;j>0;j--){
                result.set(j,result.get(j)+result.get(j-1));
            }
        }

        return result;
    }
}
