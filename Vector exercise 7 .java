
class Main {
  public static void main(String[] args) {
    int x;
    double[] vetor = new double[5];
    double madmax = vetor[0];
    double min = vetor[0];
  
    for( x = 1 ; x < vetor.length; x++){
       vetor[x] = (double) (Math.random() * 10) + 1;
       System.out.println(vetor[x]);
    if(vetor[x] > madmax){
      madmax = vetor[x];
        }
    if(vetor[x] < min){
      min = vetor[x];
      }
    }  
    System.out.println("Maior valor: " + madmax);
    System.out.println("Menor valor: " + min);

  }
}
