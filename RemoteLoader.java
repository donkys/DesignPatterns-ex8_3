public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light bedroomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAC = new Airconditioner("Bed Room");

        Command bedroomLightOn = new LightOnCommand(bedroomLight);
        Command bedroomLightOff = new LightOffCommand(bedroomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command bedroomACOn = new AirConditionerOnCommand(bedroomAC, 25);
        Command bedroomACOff = new AirConditionerOffCommand(bedroomAC);

        remoteControl.setCommand(0, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, bedroomACOn, bedroomACOff);
        System.out.println("slot 0, light Bed Room");
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println("--------------------------------");
        System.out.println("slot 1, light Kitchen");
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        System.out.println("--------------------------------");
        System.out.println("slot 2, AC Bed Room");
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        System.out.println("--------------------------------");
        System.out.println("test one unavailable slot, slot 3");
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}
