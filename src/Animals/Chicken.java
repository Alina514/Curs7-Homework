package Animals;

import Interface.AnimalI;

public class Chicken implements AnimalI {
    public String walk() {
        return "Chicken is walking";
    }

    @Override
    public String talk() {
        return "Cluck!";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }
}
