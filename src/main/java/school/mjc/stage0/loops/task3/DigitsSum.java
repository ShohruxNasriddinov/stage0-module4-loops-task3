package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum=0;
        for (int i = 0; 0 < t || 0>t; i++) {
            sum+=t%10;
            t/=10;
        }
        if (sum>0)
            System.out.println(sum);
        else
            System.out.println(sum*-1);
    }
}
