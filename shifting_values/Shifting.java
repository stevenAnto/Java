import java.util.* ;

public class Shifting{
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  public static  void main(String []arg ){
    int scheduled []; 
    scheduled = genArrayAleatorio(31);
    int rpta=0;
    while(rpta!=-1){
      System.out.println("si desea salir presione -1");
      rpta=sc.nextInt();   
      mostrar(scheduled);
    shifting(scheduled);
    mostrar(scheduled);
    }


  }
  public static  int [] genArrayAleatorio(int a){
    int [] array = new int [a] ;
    for(int i =0 ; i<a; i++){
      array[i]=1+ r.nextInt(4);
    }
    return array;
  }
  public static void mostrar(int a[]){
    for(int i =0 ; i<a.length; i++){
      System.out.print(a[i]+",");
    }
    System.out.println();

  }
  public static void shifting(int a[]){
    for(int i=0; i< a.length-1;i++){
      a[i]=a[i+1];
    }
    System.out.println("ingrese el ultimo horario");
    a[a.length-1]= sc.nextInt();
  }
}
