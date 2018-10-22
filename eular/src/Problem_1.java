import java.util.ArrayList;
import java.util.List;

public class Problem_1 {


    public static void main(String [] args){

        List<Integer> multiThree = getMultiplesOfNum(1000, 3);
        System.out.println(multiThree);
        List<Integer> multiFive = getMultiplesOfNum(1000, 5);
        System.out.println(multiFive);

        multiThree.removeAll(multiFive);
        System.out.println("after");
        System.out.println(multiThree);
        System.out.println(multiFive);

        int sumMultThree = multiThree.stream().mapToInt(Integer::intValue).sum();
        int sumMultFive = multiFive.stream().mapToInt(Integer::intValue).sum();
        int sumOut = sumMultThree+sumMultFive;
        System.out.println("sum as : "+ sumOut);

    }


    private static List<Integer> getMultiplesOfNum(int endNum, int num){

        List<Integer> multiples = new ArrayList<Integer>();

        for(int i=1; i<endNum; i++){
            if (i % num ==0){
                multiples.add(i);
            }
        }

        return multiples;
    }

}
