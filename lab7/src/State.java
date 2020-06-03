import java.util.ArrayList;

public abstract class State {

    protected TextHandle textHandle;
    protected ArrayList<HandleFunction> handler;

    abstract public void enterText(String s);

    public State() {
        textHandle = new TextHandle();
        handler = new ArrayList<>(1);
    }

    public State(TextHandle textHandle) {
        this.textHandle = textHandle;
        handler = new ArrayList<>(1);
    }

    public TextHandle getTextHandle() {
        return textHandle;
    }

    public void setTextHandle(TextHandle textHandle) {
        this.textHandle = textHandle;
    }

    public void handle() {
        for (HandleFunction h :
                handler) {
            h.handleState();
        }
    }

    public void changeHandle(HandleFunction h) {
        handler.clear();
        handler.add(h);
        handle();
    }

    public boolean deleteHandle(HandleFunction h) {
        return (handler.size() > 1) && handler.remove(h);
    }

    public void addHandle(HandleFunction h) {
        handler.add(h);
        handle();

    }

    public void describeState() {
        System.out.println(this.getClass().getSimpleName() + " with " + textHandle.getInput() + "in " + textHandle.getFontSize() + "font size");
    }
}
