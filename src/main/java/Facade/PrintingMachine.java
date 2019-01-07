package Facade;

import Proxy.MachineState;
import Proxy.ProxyState;
import Singleton.Engine;

public class PrintingMachine implements Machine {

    private Engine engine = Engine.getInstance();
    private MachineState machineState = new ProxyState("update your system");

    @Override
    public void work() {
        engine.turnOnEngine();
        machineState.showState();

        System.out.println("Printing machine -> works");
    }

    @Override
    public void stopWork() {
        System.out.println("Printing machine -> stopped");

        engine.turnOffEngine();
    }
}
