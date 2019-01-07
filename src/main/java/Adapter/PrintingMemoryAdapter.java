package Adapter;

public class PrintingMemoryAdapter extends PrintingMemoryStorage implements MemoryStorage {
    @Override
    public void checkMemory() {
        printingMachineMemoryCheck();
    }

    @Override
    public void cleanMemory() {
        printingMachineMemoryClean();
    }
}
