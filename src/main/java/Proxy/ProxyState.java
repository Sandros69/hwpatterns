package Proxy;

public class ProxyState implements MachineState {
    private String currentState;

    private RealState realState;

    public ProxyState(String currentState) {
        this.currentState = currentState;
    }

    @Override
    public void showState() {
        if(realState == null) {
            realState = new RealState(currentState);
        }
        realState.showState();
    }
}
