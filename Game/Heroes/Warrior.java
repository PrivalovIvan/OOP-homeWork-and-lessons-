package Heroes;

import impliments.Defense;
import impliments.Weapon;

public abstract class Warrior<T extends Weapon, E extends Defense> {
    private String name;
    private T weapon;
    private Integer healthPoint;
    private E defense;

    public Warrior(String name, T weapon, Integer healthPoint, E defense) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.defense = defense;
    }

    public E getDefense() {
        return defense;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format(
                "Воин: " + getName() + ", Оружие: " + getWeapon() + ", Здоровье: " + getHealthPoint()
                        + ", Защита: " + getDefense());
    }

}
