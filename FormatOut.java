import java.util.*;

public class  FormatOut{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []arg){
    final String HEADING_FORM = "%-25s%13s%13s%15s\n";
    final String DATA_FORM = "%-25s%13.2f%13.2f%15.2f\n";
    double actual1=1149.999;
    double budget1 =1400;
    double actual2=2100.1111;
    double budget2=2000;
    double remaining1, remaining2;
    System.out.printf(HEADING_FORM,"Account","Actual"
	,"Budget", "Remaining");
    System.out.printf(HEADING_FORM,"______","_____","_____"
	,"_____");
    remaining1 = budget1-actual1;
    remaining2 = budget2- actual2;
    System.out.println(remaining1);
    System.out.println(remaining2);
    System.out.printf(DATA_FORM,"Office Suplies",actual1, budget1, remaining1);
    System.out.printf(DATA_FORM,"Photocopying", actual2, budget2, remaining2);;
  }
}
