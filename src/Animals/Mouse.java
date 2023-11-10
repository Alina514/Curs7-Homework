package Animals;

import Interface.AnimalI;

public class Mouse implements AnimalI {
    public String walk() {
        return "Mouse is walking";
    }

    @Override
    public String talk() {
        return "Squeak!";
    }

    @Override
    public String eat() {
        return "Mouse is eating";
    }
}
