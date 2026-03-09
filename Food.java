public class Food {
    private String name;
    public int energyIncrease;
    public int happinessIncrease;
    public int weightGain;
    
  public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
    this.name = name;
    this.energyIncrease = energyIncrease;
    this.happinessIncrease = happinessIncrease;
    this.weightGain = weightGain;
  }
  
  public String getName(){
    return name;
  }
  
  public int getEnergyIncrease(){
    return energyIncrease;
  }
  
  public int getHappinessIncrease(){
    return happinessIncrease;
  }
  
  public int getWeightGain(){
    return weightGain;
  }
    
}
