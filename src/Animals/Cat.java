package Animals;

import Interface.AnimalI;

public class Cat implements AnimalI {
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String talk() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }
}
