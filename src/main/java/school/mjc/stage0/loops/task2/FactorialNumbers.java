package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive < 0) {
            return;
        }

        int factorial = 1;
        int current = 0;

        while (current <= printToInclusive) {
            System.out.println(factorial);
            factorial *= (current+1);
            current++;
        }
    }
}
