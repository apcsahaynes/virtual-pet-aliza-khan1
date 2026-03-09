public class Sickness {
    private String name;
    public int sicknessDecrease;
    
  public Sickness(String name, int sicknessDecrease){
    this.name = name;
    this.sicknessDecrease = sicknessDecrease;
  }
  
  public String getName(){
    return name;
  }
  
  public int getHealthIncrease(){
    return sicknessDecrease;
  }
    
    
    
}
