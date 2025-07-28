package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class desafio3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isNegative = n -> n < 0;
        List<Integer> negativeNumbers = numbers.stream().filter(isNegative).toList();

        if (negativeNumbers.isEmpty()) {
            System.out.println("Todos os números são positivos.");
        } else {
            System.out.println("Existem números negativos na lista: " + negativeNumbers);
        }

    }
}
