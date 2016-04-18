package log;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by zhengyiwang on 4/18/16.
 */
public class ErrorLogger implements Logger {

    private PrintWriter writer = null;

    public ErrorLogger(String logfile){
        try {
            writer = new PrintWriter(logfile, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void log(String s) {
        writer.println(s);
        writer.flush();
    }

    @Override
    public void closeLog() {
        writer.close();
    }
}
