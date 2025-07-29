package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();

        int result = squaredNumbers.stream().reduce(0, Integer::sum);
        System.out.println("A soma do quadrado dos números da lista é: " + result);
    }
}
