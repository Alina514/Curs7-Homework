package Animals;

import Interface.AnimalI;

public class Duck implements AnimalI {
    public String walk() {
        return "Duck is walking";
    }

    @Override
    public String talk() {
        return "Quack!";
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }
}
