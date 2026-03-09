public class VirtualPet {
  private String name;
  private int energy;
  private int happiness;
  private int sickness;
  private int cleanliness;
  private int weight;
  private int ageMonths;
  private int ageYears;

  public VirtualPet(String name){
    this.name = name;
    this.energy = 0;
    this.happiness = 0;
    this.sickness = 0;
    this.cleanliness = 0;
    this.weight = 5;
    this.ageMonths = 0;
    this.ageYears = 0;
  }

  public String getName(){
    return name;
  }
  
  public int getEnergyLevel(){
    return energy;
  }

  public int getHappinessLevel(){
    return happiness;
  }
  
  public int getSicknessLevel(){
    return sickness;
    }
  
  public int getCleanlinessLevel(){
    return cleanliness;
  }
  
  public int getHealthLevel(){
    return 10 + energy + happiness + cleanliness - sickness;
  }
  
  public int getWeight(){
    return weight;
  }
  
  public int getAgeYears(){
    return ageYears;
  }
  
  public int getAgeMonths(){
    return ageMonths;
  }

  public void feed(Food f){
    if (energy < 10){
      energy += f.energyIncrease;
      weight += f.weightGain;
    }
  }

  public boolean play(Game g){
    if (happiness < 10){
      happiness += g.happinessIncr;
    }
    if (weight > 5){
      weight -= g.weightDecr;
    }
    return g.isWinner();
  }

  public void giveMedicine(){
    if (sickness > 0){
      sickness--;
    }
  }
  
  public void getClean(){
    if (cleanliness < 10){
      cleanliness++;
    }
  }

  public void updateStatus(){
    if (happiness > 0){
      happiness--;
    }
    if (energy > 0){
      energy--;
    }
    if (sickness < 10){
      sickness++;
    }
    if (cleanliness > 0){
      cleanliness--;
    }
    ageMonths++;
    ageConverter();
  }

  private void ageConverter(){
    if (ageMonths >= 12){
      ageYears++;
      ageMonths = 0;
    }
  }
}
