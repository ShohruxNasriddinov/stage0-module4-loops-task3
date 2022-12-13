package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber<0 || lengthOfLastNumber==0){
            System.out.println(0);
        }
        int sum=1;
        int a=0;
        for (int i = 0; i <= lengthOfLastNumber; i++) {
            a=((int)(Math.pow(10,i)+a));
            int b=9*a;
            sum+=b;
        }
        System.out.println(sum);
    }
}
