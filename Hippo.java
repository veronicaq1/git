/*********************************************
 * Sample solution Hippo class
 *********************************************/
public class Hippo extends Hooved
{
  @Override
  public void speak(){
    groan();
  }
  public void groan()
  {
    System.out.println("The hippo groans.");
  }
}