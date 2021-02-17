package Interface;

import java.util.Date;

public class SpacedLogger implements Logger{
    @Override
    public void log(String log) {
        Date date = new Date();
        System.out.println(date + "\n" + log.replaceAll(".", "$0"));
    }

    @Override
    public void error(String err) {
        Date date = new Date();
        System.out.println(date + "\n" + "ERROR: " + err.replaceAll(".", "$0"));
    }
}
