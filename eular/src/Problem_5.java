import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem_5 {

    public static void main(String [] args) {

        List<Integer> allPrimeFactors = new ArrayList<Integer>();
        int endNum=20;
        int outProd = 1;

        for (int k=4;k<endNum;k++){
            List<Integer> primeFactors =  getPrimeFactors(k);
//            System.out.println("k and prime facts as : "+k+" : "+primeFactors);
//            System.out.println("allPrimeFactors as : "+allPrimeFactors);

            boolean subset = allPrimeFactors.containsAll(primeFactors);
//            System.out.println("subset as  : "+ subset);

            if (!subset){
                primeFactors.removeAll(allPrimeFactors);
                allPrimeFactors.addAll(primeFactors);
            }else {
                for (int i=0;i<primeFactors.size();i++){
                    int iPrimeFactor = primeFactors.get(0);
                    int primeFactFreq = Collections.frequency(primeFactors, iPrimeFactor);
                    int allPrimeFreq = Collections.frequency(allPrimeFactors,iPrimeFactor);
                    if (primeFactFreq>allPrimeFreq){
                        allPrimeFactors.add(iPrimeFactor);
                    }
                }
            }
        }

        System.out.println("final allPrimeFactors as : "+allPrimeFactors);

        for (int l=0;l<allPrimeFactors.size();l++){
            outProd*=allPrimeFactors.get(l);
        }
        System.out.println(outProd);
    }

    private static List<Integer> getPrimeFactors(int inNum){

        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i=2; i<inNum;i++){
            while (inNum%i ==0){
//                System.out.println(i);
                primeFactors.add(i);
                inNum = inNum/i;
            }
        }

        if (inNum>2){
            primeFactors.add(inNum);
//            System.out.println(inNum);
        }
        return primeFactors;
    }

}
