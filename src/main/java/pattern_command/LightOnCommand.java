package pattern_command;

/**
 * The concrete command of the uml diagram
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        light.increaseDim();
        System.out.println(light.name + " is " + light.lightStatus);
    }

    @Override
    public void undo() {
        light.off();
        light.decreaseDim();
        System.out.println("undo on command");
    }


}
