import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cont = 3;
    int tempmedia = 0;
    int soma = 0;
    int x;
    int vetor[] = new int[cont];
    
    //pedir pro usuario inserir 10 valores de temperatura:
    for( x = 0; x < cont; x++) {   
      System.out.print("Digite o valor da temperatura (em Celsius) => ");
        vetor[x] = input.nextInt();
      //agora, eu calculo a soma das temperaturas:
        soma += vetor[x];
    }
    //vamos calcular a media das temperaturas:
       tempmedia = soma / cont;

      System.out.print("A temperatura média da região é: " + tempmedia);
  }
}
