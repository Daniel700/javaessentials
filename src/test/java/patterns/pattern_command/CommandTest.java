package patterns.pattern_command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCommandPattern() throws Exception {

        RemoteControl control = new RemoteControl();
        Light livingRoomLight = new Light("LivingRoom");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand lightOnCommandLivingRoom = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommandLivingRoom = new LightOffCommand(livingRoomLight);
        LightOnCommand lightOnCommandKitchen = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommandKitchen = new LightOffCommand(kitchenLight);

        control.setCommand(0, lightOnCommandLivingRoom, lightOffCommandLivingRoom);
        control.setCommand(3, lightOnCommandKitchen, lightOffCommandKitchen);


        System.out.println(control);
        control.onButtonWasPushed(0);
        control.offButtonWasPushed(0);
        control.undoButtonWasPushed();

        System.out.println(control);
        control.onButtonWasPushed(3);
        control.offButtonWasPushed(3);

    }

}
