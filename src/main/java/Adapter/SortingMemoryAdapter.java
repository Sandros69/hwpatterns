package Adapter;

public class SortingMemoryAdapter extends SortingMemoryStorage implements MemoryStorage {
    @Override
    public void checkMemory() {
        sortingMachineMemoryCheck();
    }

    @Override
    public void cleanMemory() {
        sortingMachineMemoryClean();
    }
}
