public class DefaultState extends State {

    final private HandleFunction
            defaultHandle = () -> {
        System.out.println("Show default interface");
    };

    public DefaultState() {
        super();
        handler.add(defaultHandle);
    }

    public DefaultState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);

    }

    @Override
    public void enterText(String s) {
        System.out.println(textHandle.enterText(s));
    }
}
