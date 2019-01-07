package Template;

import Adapter.PrintingMemoryAdapter;
import Facade.MachineLauncher;

public class PrintingMachineWork extends MachineWork {

    private MachineLauncher machineLauncher = new MachineLauncher();
    private PrintingMemoryAdapter sma = new PrintingMemoryAdapter();

    public void beginWork() {
        machineLauncher.launchPrintingMachine();
    }

    public void checkMemory() { sma.checkMemory();}

    @Override
    public void initializeProcess() {
        System.out.println("Initializing printing process...");
    }

    @Override
    public void doSomeOperations() {
        System.out.println("Print...");
    }

    @Override
    public void resetAllSettings() {
        System.out.println("All print configuration is dropped...");
    }

    public void stopWork() { machineLauncher.stopPrintingMachine(); }
}
