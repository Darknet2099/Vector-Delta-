import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int etapas = 0;
        int duracaoEtapa = 30;
        int tempo = 0;
      Scanner dados = new Scanner(System.in);
      
        System.out.println("Digite a quantidade de etapas: ");
      etapas = dados.nextInt();
      
      tempo = etapas * duracaoEtapa;
        System.out.println("O tempo total de produção é de " + tempo + " minutos.");

  }
}
