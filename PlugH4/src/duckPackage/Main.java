package duckPackage;
import duckPackage.fly.*;
import duckPackage.sound.*;
import duckPackage.attack.*;
import duckPackage.defense.*;

public class Main {
  public static void main(String[] args) {
    
    Duck superDuck = new Duck(new FlyRoket(), new SoundHigh(), new AttackArrow(), new DefenseShield());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println("");
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new FlyWings(), new SoundNormal(), new AttackSword(), new DefenseArmor());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();
    
    System.out.println("");
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setFlyBehaviour(new FlyPlane());
    superDuck.fly();
    superDuck.sound(); 
    superDuck.attack();
    superDuck.defense();
  }
}
