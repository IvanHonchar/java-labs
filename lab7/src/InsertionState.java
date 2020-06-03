public class InsertionState extends State {

    final protected HandleFunction
            defaultHandle = () -> {
        System.out.println("Show picture insertion interface");
    };

    public InsertionState() {
        super();
        handler.add(defaultHandle);

    }

    public InsertionState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);
    }

    @Override
    public void enterText(String s) {
        System.out.println(textHandle.getInput());
    }
}
