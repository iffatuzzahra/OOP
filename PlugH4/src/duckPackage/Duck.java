package duckPackage;
import duckPackage.fly.*;
import duckPackage.sound.*;
import duckPackage.attack.*;
import duckPackage.defense.*;

public class Duck {
    private Fly flyBehav;
    private Sound soundBehav;
    private Attack attackBehav;
    private Defense defenseBehav;
    
    public Duck (Fly flyBehav, Sound soundBehav, Attack attackBehav, Defense defenseBehav) {
        this.flyBehav = flyBehav;
        this.soundBehav = soundBehav;
        this.attackBehav = attackBehav;
        this.defenseBehav = defenseBehav;
    }
    public void setFlyBehaviour(Fly flyBehav){
        this.flyBehav = flyBehav;
    }
    public void setSoundBehavour(Sound soundBehav){
        this.soundBehav = soundBehav;
    }
    public void setAttackBehaviour(Attack attackBehav){
        this.attackBehav = attackBehav;
    }
    public void setDefenseBehaviour(Defense defenseBehav){
        this.defenseBehav = defenseBehav;
    }
    public void fly(){
        flyBehav.fly();
    }
    public void sound(){
        soundBehav.sound();
    }
    public void attack(){
        attackBehav.attack();
    }
    public void defense(){
        defenseBehav.defense();
    }
}
