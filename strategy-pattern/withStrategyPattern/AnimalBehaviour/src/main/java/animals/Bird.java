package animals;

import animals.FlyStrategy.NormalFly;
import animals.WalkStrategy.CannotWalk;

public class Bird extends Animal{

    Bird(){
        super(new NormalFly(), new CannotWalk());
    }
}
