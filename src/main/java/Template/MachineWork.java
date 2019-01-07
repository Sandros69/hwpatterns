package Template;

public abstract class MachineWork {
    abstract void beginWork();
    abstract void checkMemory();
    abstract void initializeProcess();
    abstract void doSomeOperations();
    abstract void resetAllSettings();
    abstract void stopWork();

    public final void launch(){
        beginWork();

        checkMemory();

        initializeProcess();

        doSomeOperations();

        resetAllSettings();

        stopWork();
    }
}