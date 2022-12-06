package Def.Def_archer;

import impliments.Defense;

public class Shield implements Defense {

    @Override
    public Integer def() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Shield: " + def());
    }
}
