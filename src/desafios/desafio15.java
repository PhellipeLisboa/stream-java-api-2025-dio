package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> negativeNumbers = numbers.stream().filter(n -> n < 0).toList();

        System.out.println(negativeNumbers.isEmpty() ?
                "Não existem números negativos na lista." :
                "Existem números negativos na lista: " + negativeNumbers);
    }
}
