package pattern_command;

/**
 * The receiver of the uml diagram
 *
 * This class is used to perform the actual work.
 */
public class Light {

    String name;
    boolean lightStatus = false;
    int dim = 0;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        lightStatus = true;
    }

    public void off(){
        lightStatus = false;
    }

    public void increaseDim(){
        dim += 10;
    }

    public void decreaseDim(){
        dim -= 10;
    }

}
