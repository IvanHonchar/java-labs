public class CreateTableState extends State {

    final private HandleFunction defaultHandle = () -> {
        System.out.println("Show Table creation interface");
    };

    public CreateTableState() {
        super();
        handler.add(defaultHandle);
    }

    public CreateTableState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);

    }

    @Override
    public void enterText(String s) {
        System.out.println(textHandle.getInput());
    }
}