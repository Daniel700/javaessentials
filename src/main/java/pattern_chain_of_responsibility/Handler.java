package pattern_chain_of_responsibility;


/**
 * interface handler - this could be also an abstract class and define some standard procedure for the process() method
 */
public interface Handler {

    public void setNextHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();

}
