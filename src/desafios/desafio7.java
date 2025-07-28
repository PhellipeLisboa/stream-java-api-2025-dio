package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> sortedNumbers = numbers.stream().distinct().sorted().toList();
        int secondLargestNumberIndex = sortedNumbers.size() - 2;

        System.out.println("O segundo maior número da lista é : " + sortedNumbers.get(secondLargestNumberIndex));
    }
}
