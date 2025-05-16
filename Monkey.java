/*********************************************
 * Sample solution Monkey class
 *********************************************/
public class Monkey extends Primate
{
  public void climb()
  {
    System.out.println("The monkey climbs.");
  }
  @Override
  public void speak(){
    hoot();
    howl();
  }
  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public void howl()
  {
    System.out.println("The monkey howls.");
  }
}