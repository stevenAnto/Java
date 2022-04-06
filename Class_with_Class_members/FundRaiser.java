import java.util.*;

public class FundRaiser{
  static Scanner sc = new Scanner(System.in);
  public static final double GOAL = 10000;
  public static void main(String []arg){
    int numberAgents;
    double totalValue;
    String name;

    System.out.println("Enter total number of agent");
    numberAgents =sc.nextInt();
    for(int i =0; i<numberAgents; i++){
      System.out.println("Enter name of agent");
      name = sc.next();
      new Agent(name);
    }
    do{
      Agent.addAllValues();
      System.out.println("se hizo la contribucion");
      totalValue= Agent.getAllValues();
      System.out.println("total valor"+totalValue);
    }while(totalValue< GOAL);
    System.out.println("Time to spend");
  }
}
