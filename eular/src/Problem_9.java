public class Problem_9 {

    public static void main(String [] args) {

        for (int a=1;a<500;a++){
            for (int b=1+1;b<500;b++){
                int c = 1000-a-b;
                if (a*a+b*b==c*c){
                    System.out.println("found as : "+a+" , "+b+" , "+c);
                    System.out.println(a*b*c);
                    break;
                }
            }

        }
        System.out.println("finished");

    }

}
