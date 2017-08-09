package pattern_command;

/**
 * the command interface of the uml diagram
 */
public interface Command {

    void execute();
    void undo();

}
