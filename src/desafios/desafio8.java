package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> digits = numbers.stream().flatMap(n -> String.valueOf(n).chars().mapToObj(Character::getNumericValue)).toList();

        Integer result = digits.stream().reduce(0, Integer::sum);
        System.out.println("A soma dos dígitos da lista é: " + result);

    }
}
