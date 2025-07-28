package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class desafio5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isGreaterThanFive = n -> n > 5;
        List<Integer> numbersGreaterThanFive = numbers.stream().filter(isGreaterThanFive).toList();

        if (!numbersGreaterThanFive.isEmpty()) {
            int sum = numbersGreaterThanFive.stream().reduce(0, Integer::sum);
            double average = (double) sum / numbersGreaterThanFive.size();
            System.out.println("Média dos números maiores que 5: " + average);
        } else {
            System.out.println("Nenhum número maior que 5 encontrado.");
        }

    }
}
