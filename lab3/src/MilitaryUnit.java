import java.util.ArrayList;
import java.util.List;

public class MilitaryUnit implements Soldier {

    private List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void attack() {
        soldiers.forEach(Soldier::attack);
    }
}
