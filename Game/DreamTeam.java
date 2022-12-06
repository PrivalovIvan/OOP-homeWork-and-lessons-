import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Heroes.Hero;
import Heroes.Warrior;

public class DreamTeam<T extends Warrior> implements Iterable<T> {
    private Hero komandosWarriors;

    private List<T> teamWar = new ArrayList<>();

    public DreamTeam(Hero komandosWarriors) {
        this.komandosWarriors = komandosWarriors;
    }

    public void add(T pers) {
        teamWar.add(pers);
    }

    @Override
    public Iterator<T> iterator() {
        return teamWar.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(komandosWarriors.toString() + "\n");
        for (T item : this) {
            sb.append(item.toString() + "\n");
        }
        return sb.toString();
    }

    public Integer getTeamHP() {
        int sum = komandosWarriors.getHealthPoint();
        for (T item : this) {
            sum += item.getHealthPoint();
        }
        return sum;
    }
}
