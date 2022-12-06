package Gun;

import impliments.Weapon;

public class Staff implements Weapon {

    @Override
    public Integer damage() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Staff: " + damage());
    }
}
