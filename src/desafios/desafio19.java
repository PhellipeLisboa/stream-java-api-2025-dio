package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numbersDivisibleByThreeAndFive = numbers.stream().filter(n -> (n % 3 == 0 && n % 5 == 0)).toList();
        int result = numbersDivisibleByThreeAndFive.stream().reduce(0, Integer::sum);

        System.out.println("A soma dos números da lista múltiplos de 3 e 5 é: " + result);
    }
}
