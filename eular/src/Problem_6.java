public class Problem_6 {

    public static void main(String [] args) {

        int sumOfSqr = sumOfSqr(100);
        int sqrOfSum = sqrOfSum(100);
        System.out.println("diff as : "+ (sqrOfSum-sumOfSqr));

    }

    private static int sumOfSqr(int endNum){
        int sumOfSqr = 0;

        for (int i=1;i<=endNum;i++){
            sumOfSqr+=i*i;
        }

        return sumOfSqr;
    }

    private static int sqrOfSum(int endNum){
        int vSum=0;

        for (int j=0;j<=endNum;j++){
            vSum+=j;
        }
        int sqrOfSum = vSum*vSum;

        return sqrOfSum;

    }
}
