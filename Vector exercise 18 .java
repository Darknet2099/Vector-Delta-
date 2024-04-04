import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorTemperatura = Integer.MIN_VALUE;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite a temperatura " + i + ": ");
            int temperatura = scanner.nextInt();
            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }
        System.out.println("A maior temperatura registrada foi: " + maiorTemperatura);
    }
  }
