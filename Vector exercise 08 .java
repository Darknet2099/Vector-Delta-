
class Main {
  public static void main(String[] args) {
    int x;
    int[] vetorA = new int[15];
    int[] vetorB = new int[15];


       System.out.println("Vetor A: ");
    for( x = 1 ; x < vetorA.length; x++){
       vetorA[x] = (int) (Math.random() * 10) + 1;
       System.out.print(vetorA[x] + " ");
    }
    for (x = 0; x < vetorA.length; x++) {
        vetorB[x]= vetorA[vetorA.length - 1 - x];
    }
        System.out.println("\nVetor B: ");
    for (x = 0; x < vetorB.length; x++) {
      System.out.print(vetorB[x] + " ");
    }
  }
}
