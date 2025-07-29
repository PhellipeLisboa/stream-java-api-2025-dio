package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> distinctNumbers = numbers.stream().distinct().toList();

        System.out.println(distinctNumbers.size() == 1 ?
                "Todos os números da lista são iguais." :
                "Nem todos os números da lista são iguais.");
    }
}
