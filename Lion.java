/*********************************************
 * Sample solution Lion class
 * 
 * created in step 5
 * 
 *********************************************/
public class Lion extends Feline
{
  public void huntInPacks()
  {
    System.out.println("The lion hunts in packs.");
  }
  @Override
  public void speak(){
    roar();
  }
}