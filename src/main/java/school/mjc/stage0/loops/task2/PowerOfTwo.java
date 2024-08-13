package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        int current = 0;
        while (current <= power) {
            System.out.println(2^current);
            current++;
        }
    }
}
