package animals;

import animals.FlyStrategy.CannotFly;
import animals.WalkStrategy.NormalWalk;

public class Lion extends Animal{

    Lion(){
        super(new CannotFly(), new NormalWalk());
    }
}
