import java.util.ArrayList;
import java.util.List;

public class Problem_3 {

    public static void main(String [] args) {
        long inNum=600851475143L;
        long maxPrimeFactor = 0;

        for (long i=2; i<inNum;i++){
            while (inNum%i ==0){
                if (i>maxPrimeFactor){
                    maxPrimeFactor=i;
                }
                inNum = inNum/i;
            }
        }

        if (inNum>2){
            if (inNum>maxPrimeFactor){
                maxPrimeFactor=inNum;
            }
        }

        System.out.println(maxPrimeFactor);

    }
}
