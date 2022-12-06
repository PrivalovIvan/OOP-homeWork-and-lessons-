package Def.Def_mage;

import impliments.Defense;

public class Mantle implements Defense {

    @Override
    public Integer def() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Mantle: " + def());
    }
}
