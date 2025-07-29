package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class desafio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o limite inferior do intervalo: ");
        int min = scanner.nextInt();
        System.out.println("Escolha o limite superior do intervalo: ");
        int max = scanner.nextInt();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numberBetweenFiveAndTen = numbers.stream().filter(n -> (n > min && n < max)).toList();
        System.out.printf("Os números da lista entre %s e %s são: %s\n", min, max, numberBetweenFiveAndTen);
    }
}
