package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int start = multiplyByAndToInclusive < 0 ? multiplyByAndToInclusive : 0;
        int end = multiplyByAndToInclusive < 0 ? 0 : multiplyByAndToInclusive;
        int current = start;

        while (current <= end) {
            System.out.println(current * multiplyByAndToInclusive);
            current++;
        }
    }
}
