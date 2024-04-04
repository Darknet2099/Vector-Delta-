import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cont = 10;
    int result;
    int quantidade;
    int variavel;
    System.out.print("Digite o numero da Tabuada que deseja imprimir=> ");
    variavel = input.nextInt();
    int x = 1;
    for(x = 1; x <= cont; x++){
      result = variavel * x;
      System.out.println(variavel + "x" + x + "=" + result);
    }
  }
}
