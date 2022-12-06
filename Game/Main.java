import Def.Def_archer.Shield;
import Def.Def_mage.DragonsMantle;
import Def.Def_mage.Mantle;
import Gun.Bow;
import Gun.LongBow;
import Gun.Staff;
import Heroes.Archer;
import Heroes.Hero;
import Heroes.Mage;
import Heroes.Warrior;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Legolas", new Bow(), 150, new DragonsMantle());
        DreamTeam<Archer> archer = new DreamTeam<>(hero1);
        archer.add(new Archer("Archer1", new Bow(), 100, 25, new Shield()));
        archer.add(new Archer("Archer2", new LongBow(), 100, 25, new Shield()));
        archer.add(new Archer("Archer3", new Bow(), 100, 25, new Shield()));

        Hero hero2 = new Hero("Aragorn", new Staff(), 150, new DragonsMantle());
        DreamTeam<Warrior> mage = new DreamTeam<>(hero2);
        mage.add(new Mage("Mage1", new Staff(), 175, 15, 75, new Mantle()));
        mage.add(new Archer("Archer2", new Bow(), 100, 25, new Shield()));

        System.out.printf("%s %d\n", archer, archer.getTeamHP());
        System.out.printf("%s %d\n", mage, mage.getTeamHP());
    }
}
