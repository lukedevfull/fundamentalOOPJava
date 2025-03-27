public class VeicleModel {
    private String code;
    private String name;
    private int year;

    public void turnOn() {
        initializeMotor();
        confereGear();
        System.out.println("Veicle is on");
    }

    public void turnOff() {
        System.out.println("Veicle is off");
    }

    private void confereGear() {
        System.out.println("Veicle is in gear");
    }

    private void initializeMotor(){
        System.out.println("Veicle is initializing motor");
    }

    public void breaking() {
        System.out.println("Veicle is breaking");
    }

    // TODO Add more methods of more veicles
}
