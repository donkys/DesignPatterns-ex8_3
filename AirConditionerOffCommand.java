public class AirConditionerOffCommand implements Command {
    private Airconditioner ac;

    public AirConditionerOffCommand(Airconditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.off();
    }
}
