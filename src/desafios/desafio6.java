package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numbersGreaterThanTen = numbers.stream().filter(n -> n > 10).toList();

        if (numbersGreaterThanTen.isEmpty()) {
            System.out.println("Não existem números maiores que 10 na lista.");
        } else {
            System.out.println("Existem números maiores que 10 na lista: " + numbersGreaterThanTen);
        }

    }
}