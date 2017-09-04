package pattern_chain_of_responsibility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CorTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testChainOfResponsibilityPattern() throws Exception {

        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(excelHandler);
        excelHandler.setNextHandler(audioHandler);
        audioHandler.setNextHandler(videoHandler);
        videoHandler.setNextHandler(imageHandler);

        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);

    }
}
