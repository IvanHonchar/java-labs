import java.util.HashMap;
import java.util.Map;

public class Screen {

    protected State state;
    private Map<String, State> stateMap;
    public Menu menu;
    public ToolBar toolBar;

    public Screen(State state) {
        menu = new Menu();
        toolBar = new ToolBar();
        initializeStateMap();

        setState(getSpecificState(state.getClass().toString()));
    }

    public void enterText(String s) {
        state.enterText(s);
    }

    private State getSpecificState(String stateName) {
        return stateMap.get(stateName) == null ?
                stateMap.get(DefaultState.class.toString()) : stateMap.get(stateName);
    }

    private void initializeStateMap() {
        stateMap = new HashMap<>();
        stateMap.put(DefaultState.class.toString(), new DefaultState());
        stateMap.put(CreateTableState.class.toString(), new CreateTableState());
        stateMap.put(InsertionState.class.toString(), new InsertionState());
    }

    private void setState(State s) {
        state = s;
        s.handle();
    }

    private void modifyState(String str) {
        State s = getSpecificState(str);
        s.setTextHandle(state.getTextHandle());
        setState(s);
    }

    public void changeHandle(HandleFunction handleFunction) {
        state.changeHandle(handleFunction);
    }

    public boolean deleteHandle(HandleFunction h) {
        return state.deleteHandle(h);
    }

    final public void addHandle(HandleFunction h) {
        state.addHandle(h);
    }

    public class Menu {

        public void createTable() {
            modifyState(CreateTableState.class.toString());
        }

        public void showMain() {
            modifyState(DefaultState.class.toString());
        }

        public void insertPicture() {
            modifyState(InsertionState.class.toString());
        }
    }

    public class ToolBar {

        public void increaseFontSize() {
            state.getTextHandle().increaseFontSize();
            modifyState(DefaultState.class.toString());
        }

        public void decreaseFontSize() {
            state.getTextHandle().decreaseFontSize();
            modifyState(DefaultState.class.toString());
        }
    }
}
