package animals;

import animals.FlyStrategy.FlyBehaviour;
import animals.WalkStrategy.WalkBehaviour;

public class Animal {

    FlyBehaviour flyBehaviour;
    WalkBehaviour walkBehaviour;
    Animal(FlyBehaviour flyBehaviour, WalkBehaviour walkBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.walkBehaviour = walkBehaviour;
    }

    public String fly(){
        return flyBehaviour.fly();
    }

    public String walk(){
        return  walkBehaviour.walk();
    }

    public String printBehaviour(){
        return this.walk() + " and "+this.fly();
    }
}
