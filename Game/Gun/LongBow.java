package Gun;

import impliments.Weapon;

public class LongBow extends Bow implements Weapon {

    @Override
    public Integer damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("LongBow:" + damage());
    }
}
