package Singleton;

public class Engine {

    private static Engine instance = new Engine();

    private Engine() {}

    public static Engine getInstance() {
        return instance;
    }

    public void turnOnEngine() {
        System.out.println("Attention: Engine turned ON");
    }

    public void turnOffEngine() {
        System.out.println("Attention: Engine turned Off");
    }

}
