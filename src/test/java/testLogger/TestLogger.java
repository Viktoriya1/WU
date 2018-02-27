package testLogger;



public class TestLogger extends AbstractLogger{


    @Override
    protected void doLogging(String stringToLog) {
        System.out.println(stringToLog);
        //log To file
    }
}
