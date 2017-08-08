import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lambda examples
 * Created by developer on 04.08.17.
 */
public class Lambda {

    private static final Logger LOGGER = Logger.getLogger( Lambda.class.getName() );

    public void example_1(){

        LOGGER.log( Level.INFO, "Programm strart!" );

        System.out.println();
        System.out.println("Standart print: ");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Lambda print: ");

        numbers.forEach((Integer value) -> System.out.print(value + " "));

        System.out.println();
        System.out.println("Lambda print: ");

        numbers.forEach(value -> System.out.print(value + " "));

        System.out.println();
        System.out.println("Lambda print: ");

        numbers.forEach(System.out::print);

        System.out.println();
        System.out.println();
        System.out.println("Sum of all elements:");
        System.out.println("Standart print: ");
        System.out.println(sumAll(numbers));
        System.out.println("Lambda print: ");
        System.out.println(sumAll(numbers, n -> true));
        System.out.println("Sum of n%2==0 elements:");
        System.out.println("Standart print: ");
        System.out.println(sumAllEven(numbers));
        System.out.println("Lambda print: ");
        System.out.println(sumAll(numbers, n -> n % 2 == 0));
        System.out.println("Sum of n->n>3 elements:");
        System.out.println(sumAll(numbers, n -> n > 3));

    }

    public int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int sumAllEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }



    public int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

}
