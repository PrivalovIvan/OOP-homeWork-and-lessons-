package Gun;

import impliments.Weapon;

public class Bow implements Weapon {

    @Override
    public Integer damage() {
        return 11;
    }

    @Override
    public String toString() {
        return String.format("Bow:" + damage());
    }
}
