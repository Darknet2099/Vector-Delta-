
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
    int vetordelta[] = new int[10];
    int vetoralpha[] = new int[10];
    int vetoromega[] = new int[10];
    int x, y;

    for(x=0; x<10; x++){
      System.out.print("Digite o " + (x+1) + "º número do vetor 1: ");
      vetordelta[x] = entrada.nextInt();
    }
    for(x=0; x<10; x++){
      System.out.print("Digite o " + (x+1) + "º número do vetor 2: ");
      vetoralpha[x] = entrada.nextInt();
    }
    for(x=0; x<10; x++){
     vetoromega[x] = vetordelta[x];
      }
    }
  }
