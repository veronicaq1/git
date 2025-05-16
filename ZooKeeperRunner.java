import java.util.ArrayList;

/*********************************************
 * Sample solution Activity 4.9.2
 *********************************************/
 public class ZooKeeperRunner
 {
   public static void main(String[] args)
   {

    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    elephant.forage();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    
    System.out.println();
   
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    
    System.out.println();
    
    //Tiger tiger2 = new Tiger();
    //Elephant elephant2 = new Elephant();

    //Gorilla gorilla = new Gorilla();
    
    System.out.println();
    
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    
    System.out.println();
    
    Hippo hippo = new Hippo();
    hippo.eat();
    
    System.out.println();
  
    Penguin penguin = new Penguin();
    penguin.fish();
    
    System.out.println();
    
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    
    System.out.println();
    
    Animal a1 = new Animal();
    a1.sleep();
  //  Object a2 = new Animal();

    ArrayList<Animal> zoo = new ArrayList<>();
    Giraffe gi = new Giraffe("leaves", false, 25.0);
    zoo.add(gi);
    Deer de = new Deer();
    zoo.add(de);

    Elephant el = new Elephant();
    zoo.add(el);

    Gorilla go = new Gorilla();
    zoo.add(go);

    Hippo hi = new Hippo();
    zoo.add(hi);

    Lion li = new Lion();
    zoo.add(li);

    Monkey mo = new Monkey();
    zoo.add(mo);

    Owl ow = new Owl();
    zoo.add(ow);

    Penguin pe = new Penguin();
    zoo.add(pe);

    Tiger ti = new Tiger();
    zoo.add(ti);

    for (Animal animal : zoo){
      animal.speak();
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //a.trumpet();
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());

    Animal a3 = new Animal();
    System.out.println(a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());

    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
   }
 }