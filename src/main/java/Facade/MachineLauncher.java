package Facade;

public class MachineLauncher {

    private SortingMachine sortingMachine;
    private PrintingMachine printingMachine;

    public MachineLauncher() {
        sortingMachine = new SortingMachine();
        printingMachine = new PrintingMachine();
    }

    public void launchPrintingMachine() { printingMachine.work(); }

    public void stopPrintingMachine() { printingMachine.stopWork(); }

    public void launchSortingMachine() {
        sortingMachine.work();
    }

    public void stopSortingMachine() { sortingMachine.stopWork(); }

}
