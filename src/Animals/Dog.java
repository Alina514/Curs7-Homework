package Animals;

import Interface.AnimalI;

public class Dog implements AnimalI {
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String talk() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }
}
