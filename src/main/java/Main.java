import Template.MachineWork;
import Template.PrintingMachineWork;
import Template.SortingMachineWork;

public class Main {

    public static void main(String[] args) {
        MachineWork machineWork = new PrintingMachineWork();
        machineWork.launch();

        System.out.println("");

        machineWork = new SortingMachineWork();
        machineWork.launch();
    }
}
