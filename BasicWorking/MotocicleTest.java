/**
 * Test class for Motocicle
 */
public class MotocicleTest extends VeicleModel {

    // Constructor
    public MotocicleTest(String code, String model, String type) {
        super(code, model, type);
    }

    /**
     * Turns on the motocicle
     */
    @Override
    public void turnOn() {
        initializeMotor();
        System.out.println(getModel() + " is on");
        MotocicleRunMessage();
    }

    /**
     * Turns off the motocicle
     */
    @Override
    public void turnOff() {
        System.out.println(getModel() + " is off");
    }

    /**
     * Simulates the motocicle breaking
     */
    @Override
    public void breaking() {
        System.out.println(getModel() + " is breaking");
    }

    /**
     * Main method for testing
     * @param args
     */
    public static void main(String[] args) {
        MotocicleTest motocicle = new MotocicleTest("123", "Motocicle", "Motorcycle");
        motocicle.turnOn();
        motocicle.breaking();
        motocicle.turnOff();
    }

}
