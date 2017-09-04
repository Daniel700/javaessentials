package patterns.pattern_command;

/**
 * The concrete command of the uml diagram
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
        light.decreaseDim();
        System.out.println(light.name + " is " + light.lightStatus);
    }

    @Override
    public void undo() {
        light.on();
        light.increaseDim();
        System.out.println("undo off command");
    }

}
