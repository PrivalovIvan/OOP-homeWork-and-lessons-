package Def.Def_archer;

public class Armor extends Shield {
    @Override
    public Integer def() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Armor: " + def());
    }
}
