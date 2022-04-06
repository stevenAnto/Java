import java.util.Scanner;

public class Agent{
  private final String NAME;
  private double value =0.0;
  private static Agent listAgents =null;
  private Agent nextAgent;

  public Agent(String name){
    this.NAME = name;
    this.nextAgent = listAgents;
    listAgents=this;
  }
  private  double  getValue(){
    return value;
  }
  private  void   addValue(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter para "+this.NAME+ " contribucion");
    this.value += sc.nextDouble();
  }
  public static double getAllValues(){
    double totalValue= 0.0;
    Agent agent = listAgents;
    while(agent != null){
      totalValue += agent.getValue();
      agent = agent.nextAgent;
    }
    return totalValue;
  }
  public static void addAllValues(){
    Agent agent = listAgents;
    while(agent != null){
      agent.addValue();
      agent = agent.nextAgent;
    }
  }
}
