public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[6];
        offCommands = new Command[6];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 6; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        System.out.print("On button ");
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        System.out.print("Off button ");
        offCommands[slot].execute();
    }

    private class NoCommand implements Command {
        public void execute() {
            System.out.println("No command is assigned to this slot");
        }
    }
}