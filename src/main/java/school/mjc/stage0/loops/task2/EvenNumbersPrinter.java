package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int counter = 0;
        while (counter <= printTillInclusive) {
            if (counter != 0) {
                System.out.println(counter);
            }
            counter += 2;

        }

    }
}
