package Interface;

import java.util.Date;

public class AsteriskLogger implements Logger{
    @Override
    public void log(String log) {
        Date date = new Date();
        System.out.println(date + "\n************" + log + "************");
    }

    @Override
    public void error(String err) {
        Date date = new Date();
        System.out.println(date + "\n***************\n" + "***" + err +"***" + "\n************");
    }
}
