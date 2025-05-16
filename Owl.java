/*********************************************
 * Sample solution Activity 4.9.2
 * 
 * Its Your Turn
 * 
 *********************************************/
public class Owl extends Bird
{
  public Owl(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An owl arrives.");
  }
  
  public Owl()
  {
    System.out.println("An owl arrives.");
  }
  @Override
  public void speak(){
    hoot();
  }
  public void hoot()
  {
    System.out.println("The owl hoots!");
  }
  public void hunt()
  {
    System.out.println("The owl hunts for food.");
  }

}