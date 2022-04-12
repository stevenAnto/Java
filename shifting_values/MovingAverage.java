import java.util.* ;

public class MovingAverage{
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  public static  void main(String []arg ){
    int [] valores;
    valores  = genArrayAleatorio(5);
    mostrar(valores);
    calculateAverage(valores);

  }
  public static  int [] genArrayAleatorio(int a){
    int [] array = new int [a] ;
    for(int i =0 ; i<a; i++){
      array[i]=9000+ r.nextInt(200);
    }
    return array;
  }
  public static void mostrar(int a[]){
    for(int i =0 ; i<a.length; i++){
      System.out.print(a[i]+",");
    }
    System.out.println();

  }
  public static void calculateAverage(int a[]){
    double sum;
    int samples;
    System.out.println("ingrese el numero de muestra");
    samples = sc.nextInt();
    for (int i =0; i<samples;i++){
      sum=0;
      for(int j=0; j < a.length-1;j++){
	a[j]=a[j+1];
	sum += a[j];
      }
      System.out.println("ingrese el ultimo valor");
      a[a.length-1]= sc.nextInt();
      mostrar(a);
      sum += a[a.length-1];
      System.out.println("Moving Avergate "+sum/a.length);
    }
  }
}
