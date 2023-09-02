package animals.WalkStrategy;

public class CannotWalk implements WalkBehaviour{

    @Override
    public String walk() {
        return "Cannot walk";
    }
}
