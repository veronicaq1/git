/*********************************************
 * Sample solution Deer class
 *********************************************/
public class Deer extends Hooved
{
  @Override
  public void speak(){
    grunt();
  }
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }
}