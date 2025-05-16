/*********************************************
 * Sample solution Gorilla class
 *********************************************/
public class Gorilla extends Primate
{
  // step 25
  public Gorilla()
  {
    System.out.println("A gorilla arrives.");
  }
  @Override
  public void speak(){
    grunt();
  }
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }
}