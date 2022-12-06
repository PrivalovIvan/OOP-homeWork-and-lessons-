package Heroes;

import Def.Def_archer.Shield;
import Gun.Bow;

public class Archer extends Warrior<Bow, Shield> {
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Archer(String name, Bow weapon, Integer healthPoint, Integer range, Shield defense) {
        super(name, weapon, healthPoint, defense);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer: range: " + getRange() + ", " + super.toString());
    }
}
