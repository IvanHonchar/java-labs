public class CompositeDemo {

    public static void main(String[] args) {
        MilitaryUnit infantryBattalion = new MilitaryUnit();
        infantryBattalion.addSoldier(new Infantryman());
        infantryBattalion.addSoldier(new Infantryman());

        MilitaryUnit trooperBattalion = new MilitaryUnit();
        trooperBattalion.addSoldier(new Trooper());
        trooperBattalion.addSoldier(new Trooper());

        MilitaryUnit regiment = new MilitaryUnit();
        regiment.addSoldier(new Trooper());
        regiment.addSoldier(infantryBattalion);
        regiment.addSoldier(trooperBattalion);

        regiment.attack();
    }
}
