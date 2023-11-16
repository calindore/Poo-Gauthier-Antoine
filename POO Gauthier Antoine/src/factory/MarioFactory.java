package factory;
import model.Mario;

public class MarioFactory{
    private static Mario _instance;
    public static Mario create() {
        return new Mario("Small model.Mario");
    }
}
