/*********************************************
 * Sample solution Activity 4.9.2
 * 
 * created in step 5
 * 
 *********************************************/
public class Elephant extends Animal
{
  // step 13
  public Elephant(String food, boolean nocturnal, double aveLifeSpan)
  { 
    // step 16: System.out.println("Elephant arrives.");
    super(food, nocturnal, aveLifeSpan);
    // step 18:
    System.out.println("An elephant arrives.");
  }
  
  // step 24
  public Elephant()
  {
    System.out.println("An elephant arrives.");
  }
  @Override
  public void speak(){
    trumpet();
  }
  public void trumpet()
  {
    System.out.println("The elephant trumpets loudly!");
  }
  
  public void forage()
  {
    System.out.println("The elephant forages for food.");
  }
  @Override
  public String toString()
{
  return "This is an object of the Elephant class.";
}
}