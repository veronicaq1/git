/*********************************************
 * Sample solution Giraffe class
 *********************************************/
public class Giraffe extends Hooved
{
  // step 27
  public Giraffe(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A giraffe arrives.");
  }
  @Override
  public void speak(){
    hum();
  }
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }
  
}