package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> primeNumbers = numbers.stream().filter(n -> {
            if (n < 2) return false;

            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }).sorted().toList();

        if (primeNumbers.isEmpty()) {
            System.out.println("Nenhum número primo foi encontrado na lista.");
        } else {
            int largestPrime = primeNumbers.get(primeNumbers.size() - 1);
            System.out.println("O maior número primo da lista é: " + largestPrime);
        }

    }

}
