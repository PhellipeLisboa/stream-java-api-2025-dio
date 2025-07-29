package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 == 1).toList();
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Os números pares da lista são: " + evenNumbers);
        System.out.println("Os números ímpares da lista são: " + oddNumbers);
    }
}
