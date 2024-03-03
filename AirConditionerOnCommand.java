public class AirConditionerOnCommand implements Command {
    private Airconditioner ac;
    private int temp;

    public AirConditionerOnCommand(Airconditioner ac, int temp) {
        this.ac = ac;
        this.temp = temp;
    }

    public void execute() {
        ac.on();
        ac.setTemp(temp);
    }
}
