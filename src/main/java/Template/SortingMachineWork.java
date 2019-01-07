package Template;

import Adapter.SortingMemoryAdapter;
import Facade.MachineLauncher;

public class SortingMachineWork extends MachineWork {

    private MachineLauncher machineLauncher = new MachineLauncher();
    private SortingMemoryAdapter sma = new SortingMemoryAdapter();

    public void beginWork() { machineLauncher.launchSortingMachine(); }

    public void checkMemory() { sma.checkMemory();}

    @Override
    public void initializeProcess() {
        System.out.println("Initialize sort...");
    }

    @Override
    public void doSomeOperations() {
        System.out.println("Sort...");
    }

    @Override
    public void resetAllSettings() {
        System.out.println("Change sorting method..");
    }

    public void stopWork() { machineLauncher.stopPrintingMachine(); }
}
