package animals;

import animals.FlyStrategy.CannotFly;
import animals.WalkStrategy.NormalWalk;

public class Dog extends Animal {

    Dog(){
        super(new CannotFly(), new NormalWalk());
    }
}
