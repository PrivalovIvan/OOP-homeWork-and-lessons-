package Heroes;

import Def.Def_mage.Mantle;
import Gun.Staff;

public class Mage extends Warrior<Staff, Mantle> {
    private Integer range;
    private Integer manaPoints;

    public Mage(String name, Staff weapon, Integer healthPoint, Integer range, Integer manaPoints, Mantle defense) {
        super(name, weapon, healthPoint, defense);
        this.range = range;
        this.manaPoints = manaPoints;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getManaPoints() {
        return manaPoints;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public void setManaPoints(Integer manaPoints) {
        this.manaPoints = manaPoints;
    }

    @Override
    public String toString() {
        return String
                .format("Mage: Дистанция: " + getRange() + ", " + "Мана: " + getManaPoints() + ", " + super.toString());
    }
}
