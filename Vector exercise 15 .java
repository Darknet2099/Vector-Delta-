
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Digite um número inteiro positivo N: ");
        n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            int fibonacci[] = new int[n];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
            System.out.println();
        }


  }
}
