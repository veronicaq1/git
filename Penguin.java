/*********************************************
 * Sample solution Activity 4.9.2
 * 
 * Its Your Turn
 * 
 *********************************************/
public class Penguin extends Bird
{
  public void fish()
  {
    System.out.println("The penguin fishes for food.");
  }
  public void sound()
  {
    System.out.println("The penguin makes an unearthly sound");
  }
  @Override
  public void speak(){
    sound();
  }
}