import java.util.*;

public class  Char{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []arg){
    String line;
    char ch;
    boolean legal= true;
    System.out.println("Entera proposed indetifier");
    line = sc. nextLine();
    ch = line.charAt(0);
    if(!(Character.isLetter(ch)||ch=='$'||ch =='_')){
      legal=false;
    }
    for(int i=1; i<line.length()&& legal;i++){
      ch= line.charAt(i);
      if(!(Character.isLetter(ch)||ch=='$'||ch =='_')){
	legal=false;
      }
    }
    if(legal){
      System.out.println("su linea es validad");
    }else{
      System.out.println("Sorry, "+line+" es wrong");
    }
  }
  public static void(){
    System.out.println("se agrego esta lineas mas solo para probar");
  }
  public static void nuevaLinea(){

  }
}
