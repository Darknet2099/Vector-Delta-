class Main {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    int soma = 0;
    for(int i = 0; i < vetor.length; i++){
      vetor[i] = (int) (Math.random() * 10);
      soma += vetor[i];
    }
    System.out.println("A média dos elementos do vetor é: " + soma/vetor.length);
  
    
      }
    }
