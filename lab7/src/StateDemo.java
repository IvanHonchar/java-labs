public class StateDemo {

    public static void main(String[] args) {

        Screen s = new Screen(new DefaultState());

        //changing the reaction on the go
        s.changeHandle(() -> {
            System.out.println("React differently");
        });

        s.addHandle(() -> {
            System.out.println("React differently x2 \n");
        });

        s.enterText("Entered in default state,");

        s.menu.createTable();

        s.enterText("Entered in create table state, ");

        System.out.println();

        s.menu.showMain();
    }
}
