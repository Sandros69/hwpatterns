package Proxy;

public class RealState implements MachineState {

    private String currentState;

    public RealState(String currentState) {
        this.currentState = currentState;
        update();
    }

    public void update() {
        System.out.println("Checking state: " + currentState);
    }

    @Override
    public void showState() {
        System.out.println("Current state: " + currentState);
    }
}
