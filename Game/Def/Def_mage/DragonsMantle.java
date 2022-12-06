package Def.Def_mage;

public class DragonsMantle extends Mantle {

    @Override
    public Integer def() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Dragon's Mantle: " + def());
    }
}
