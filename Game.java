public class Game {
    private String name;
    public int happinessIncr;
    public int weightDecr;
    
  public Game(String name, int happinessIncr, int weightDecr){
    this.name = name;
    this.happinessIncr = happinessIncr;
    this.weightDecr = weightDecr;
  }
  
  public String getName(){
    return name;
  }
  
  public int getHappinessIncr(){
    return happinessIncr;
  }
  
  public int getWeightDecr(){
    return weightDecr;
  }
   
 // public boolean play(Game g){
  //    return true;
  //}
  public boolean isWinner(){
      Math.random();
      if(Math.random()>0.5){
          return true;
      }
      else{
          return false;
      }
  }
 
}
