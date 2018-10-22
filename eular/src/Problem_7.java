import java.util.ArrayList;
import java.util.List;

public class Problem_7 {

    public static void main(String [] args) {

        int ithPrimeNum = 10001;
        int iCount=2;
        List<Integer> primeNums = new ArrayList<Integer>();
        primeNums.add(2);
        primeNums.add(3);

        int num=4;

        long startTime = System.currentTimeMillis();

//        primeNums.size()<ithPrimeNum
        while (primeNums.size()<ithPrimeNum){
            boolean isPrime = true;
//            System.out.println("num is : "+num);
            for (int i=0;i<primeNums.size();i++){
//                System.out.println("i is : "+i);

                if (num%primeNums.get(i)==0){
                    isPrime = false;
                    break;
                }
            }
//            System.out.println("isprime is : "+isPrime);
            if (isPrime){
                primeNums.add(num);
//                System.out.println(primeNums);
            }
            num+=1;
        }

        long endTime = System.currentTimeMillis();

//        System.out.println(primeNums);
        System.out.println("size as : "+primeNums.size());
        System.out.println(primeNums.get(ithPrimeNum-1));
        System.out.println("duration in milisec as : "+ (endTime-startTime));
    }
}
