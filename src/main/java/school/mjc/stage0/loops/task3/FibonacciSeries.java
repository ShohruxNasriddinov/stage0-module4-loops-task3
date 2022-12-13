package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        int rus;
        for (int i = 0; i <=lastFibonacci; i++) {
            rus=a+b;
            System.out.println(rus);
            a=b;
            b=rus;
        }
    }
}
