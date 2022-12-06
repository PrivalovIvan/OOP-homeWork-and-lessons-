package Heroes;

import impliments.Defense;
import impliments.Weapon;

public class Hero extends Warrior {

    public Hero(String name, Weapon weapon, Integer healthPoint, Defense defense) {
        super(name, weapon, healthPoint, defense);
    }

    @Override
    public String toString() {
        return String.format("Hero: " + super.toString());
    }
}
