
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  int x, y;
  int cont = 0;
    Scanner entrada = new Scanner(System.in);
    //Abaixo, é determinado o número "Gavetas" no vetor.
  int vetor [] = new int [10];
    //Abaixo, o programa está associando a variável "x" para marcar o número das posições dos números  no vetor.
    for(x = 0 ; x < vetor.length;  x++){
      System.out.println("Insira um número válido entre 1 e 10 => ");
      vetor[x] = entrada.nextInt();
      if(vetor[x] < 1 || vetor[x] > 10){
      System.out.println(" [Número inválido, insira novamente] ");  
      }
    } 
    for(x = 0; x < vetor.length; x++){
      cont = 0 ;
    for(y = 1; y <= vetor[x]; y++){
      if( vetor[x] % y == 0){
      cont++; 
        }
      }
      if(cont == 2){
      System.out.print("O número " + vetor[x] + " é primo e está na posição " + x );
      }
    }
  }
}
