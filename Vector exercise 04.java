class Main {
  public static void main(String[] args) {
    int x = 0;
    int cont = 0;
    int[] vetor = new int[20];
    while( x < vetor.length) {
      vetor[x] = (int) (Math.random() * 30) + 1 ;
      System.out.println(vetor[x]); 
    if(vetor[x] == 25){
      cont++; 
      }
     x++;
    }
      System.out.println("O número 25 apareceu " + cont + " vez(es) no vetor");
  }
}
