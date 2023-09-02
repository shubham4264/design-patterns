package animals;

import animals.FlyStrategy.NormalFly;
import animals.WalkStrategy.NormalWalk;

public class MainApplication {

    public static void main(String[] args){

        Animal animal = new Animal(new NormalFly(), new NormalWalk());
        System.out.println(animal.printBehaviour());

        Animal animal1 = new Lion();
        System.out.println(animal1.printBehaviour());

        Animal animal2 = new Bird();
        System.out.println(animal2.printBehaviour());

        Animal animal3 = new Dog();
        System.out.println(animal3.printBehaviour());
    }
}
