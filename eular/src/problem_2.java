import java.util.ArrayList;
import java.util.List;

public class problem_2 {

    static int endNum = 4000000;
    static int evenFibSum=0;

    public static void main(String [] args){
        evenFibSum=2;
        evenFibSum = fibNums(evenFibSum,1,2);
        System.out.println(evenFibSum);

    }

    private static int fibNums(int evenFibSum, int startParam, int startOthParam){
//        System.out.println("evenFibSum is : "+evenFibSum);
//        System.out.println(startParam +" "+ startOthParam);
        int num = startParam + startOthParam;

        if (num % 2==0){
            evenFibSum +=num;
        }

        if (num<endNum){
            evenFibSum = fibNums(evenFibSum,startOthParam,num);
        }

        return evenFibSum;

    }

}
