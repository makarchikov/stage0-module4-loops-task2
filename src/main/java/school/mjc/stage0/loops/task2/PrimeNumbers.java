package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive < 2) {
            return;
        }

        int current = 2;

        while (current <= printToInclusive) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(current); i++) {
                if (current % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(current);
            }
            current++;
        }
    }
}
