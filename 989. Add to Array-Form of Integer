



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger_989 {
    public static void main(String[] args) {

        AddToArrayFormOfInteger_989 output = new AddToArrayFormOfInteger_989();
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(output.addToArrayForm(num , k));
    }
    public List<Integer> addToArrayForm(int[] num, int k) {

        StringBuilder sb = new StringBuilder();
        for (int i : num){
            sb.append(i);
        }
        BigInteger bigInteger = new BigInteger(sb.toString());
        BigInteger result = bigInteger.add(BigInteger.valueOf(k));
        String resultStr = result.toString();
        List<Integer> list = new ArrayList<>();
        for (char c : resultStr.toCharArray()){
            list.add(Integer.parseInt(String.valueOf(c)));
        }
        return list;
    }
}
