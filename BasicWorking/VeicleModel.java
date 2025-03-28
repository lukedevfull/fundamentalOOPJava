/**
 * Essa classe abstrata representa um modelo de veiculo
 * @author luke
 *
 */
public abstract class VeicleModel {
    private String code;
    private String model;
    private String type;
    private int year;

    /**
     * Construtor da classe VeicleModel
     * @param code codigo do veiculo
     * @param model modelo do veiculo
     * @param type tipo do veiculo
     */
    public VeicleModel(String code, String model, String type) {
        this.code = code;
        this.model = model;
        this.type = type;
    }

    //Getters
    /**
     * Retorna o codigo do veiculo
     * @return codigo do veiculo
     */
    public String getCode() {
        return code;
    }
    /**
     * Retorna o modelo do veiculo
     * @return modelo do veiculo
     */
    public String getModel() {
        return model;
    }
    /**
     * Retorna o tipo do veiculo
     * @return tipo do veiculo
     */
    public String getType() {
        return type;
    }
    /**
     * Retorna o ano do veiculo
     * @return ano do veiculo
     */
    public int getYear() {
        return year;
    }

    //Setters
    /**
     * Seta o ano do veiculo
     * @param year ano do veiculo
     */
    public void setYear(int year) {
        this.year = year;
    }

    //Methods
    /**
     * Metodo abstrato que deve ser implementado pelas classes filhas
     */
    public abstract void turnOn();

    /**
     * Metodo abstrato que deve ser implementado pelas classes filhas
     */
    public abstract void turnOff();

    /**
     * Metodo abstrato que deve ser implementado pelas classes filhas
     */
    public abstract void breaking();

    /**
     * Metodo que imprime uma mensagem de que o veiculo esta ligado
     */
    public void MotocicleRunMessage() {
        System.out.println(getModel() + " is running confere engine what out of THE HELMET");
    }

    /**
     * Metodo que imprime uma mensagem de que o veiculo esta ligado
     */
    public void CarRunMessage() {
        System.out.println(getModel() + " is running confere engine what out of THE SEGURANCE BAND");
    }

    /**
     * Metodo que imprime uma mensagem de que o veiculo esta engrenado
     */
    public void confereGear() {
        System.out.println(getModel() + " is in gear");
    }

    /**
     * Metodo que imprime uma mensagem de que o veiculo esta inicializando o motor
     */
    public void initializeMotor(){
        System.out.println(getModel() + " is initializing motor");
    }
}

