package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println((distinctNumbers.size() == numbers.size()) ?
                "Todos os elementos da lista são distintos." :
                "Existem elementos repetidos na lista.");
    }
}
