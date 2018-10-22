import java.util.ArrayList;
import java.util.List;

public class Problem_10 {

    static List<Integer> allPrimes = new ArrayList<Integer>();

    public static void main(String [] args) {

        allPrimes.add(2);
        allPrimes.add(3);
        int endNum = 2000000;
//        2000000

        for (int i=4;i<=endNum;i++){
            boolean isPrime = checkIfPrime(i);
            if (isPrime){
                allPrimes.add(i);
            }
        }
        System.out.println(allPrimes);

        long sum = getSum();

        System.out.println("sum as : "+sum);

    }

    private static boolean checkIfPrime(int num){
        for (int j : allPrimes){
            if (num % j == 0){
                return false;
            }
        }
        return true;
    }

    private static long getSum(){
        long sum=0;
        for (int s:allPrimes){
            sum+=s;
        }

        return sum;
    }

}
