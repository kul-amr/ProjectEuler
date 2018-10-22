import java.util.ArrayList;
import java.util.List;

public class Problem_4 {

    public static void main(String [] args) {
        List<Integer> outList = new ArrayList<Integer>();
        for (int i=999;i>900;i--){
          int outNum = getProd(i);

            if (outNum>0){
                outList.add(outNum);
            }
        }
        System.out.println(outList);
        int maxNum=outList.get(0);
        for (int m=1;m<outList.size();m++){
            if (outList.get(m)>maxNum){
                maxNum=outList.get(m);
            }
        }

        System.out.println("max num is : "+maxNum);

    }

    private static int getProd(int i){
        int outNum=0;
        for (int j=999;j>900;j--){

            boolean isPalindrome = checkPalindrome(i*j);
            if (isPalindrome){
                System.out.println("i and j as : "+i+" , "+j);
                System.out.println("num as ============================: "+i*j);
                outNum=i*j;
                break;
            }
        }
        return outNum;
    }

    private static boolean checkPalindrome(int num){
        String numStr = String.valueOf(num);

        for (int k=0; k<numStr.length()/2;k++){
            if (numStr.charAt(k)!=numStr.charAt(numStr.length()-k-1)){
                return false;
            }
        }

        return true;
    }
}
