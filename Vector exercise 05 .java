class Main {
  public static void main(String[] args) {
    int x = 0;
    int cont = 0;
    int[] vetor = new int[15];
    for(x=0; x < vetor.length; x++) {
      vetor[x] = (int) (Math.random() * 50) + 1;
      System.out.println(vetor[x]); 
    if(vetor[x] == 20){
      cont++; 
      System.out.println("O número 20 apareceu " + cont + " vez(es) no vetor " + x );
      }
    }
    if(cont == 0){
      System.out.println("O número 20 não apareceu no vetor");
    }
  }
}
