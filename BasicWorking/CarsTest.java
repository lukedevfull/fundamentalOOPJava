public class CarsTest extends VeicleModel{
    //Constructor
    public CarsTest(String code, String model, String type) {
        super(code, model, type);
    }

    @Override
    public void turnOn() {
        // initialize motor
        initializeMotor();
        // confere gear
        confereGear();
        // print message
        System.out.println(getModel() + " is on");
        // print car run message
        CarRunMessage();
    }

    @Override
    public void turnOff() {
        // print message
        System.out.println(getModel() + " is off");
    }

    @Override
    public void breaking() {
        // print message
        System.out.println(getModel() + " is breaking");
    }

    public static void main(String[] args) {
        // create a new instance of the class
        CarsTest jeep = new CarsTest("123", "Jeep", "SUV");
        // turn on
        jeep.turnOn();
        // break
        jeep.breaking();
        // turn off
        jeep.turnOff();

    }
}
