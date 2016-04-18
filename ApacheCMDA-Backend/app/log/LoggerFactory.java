package log;

/**
 * Created by zhengyiwang on 4/18/16.
 */
public class LoggerFactory {
    private final String StdFile = "logs/std_log.log";
    private  final String ErrFile = "logs/err_log.log";
    public Logger getLogger(String type){
        if(type == null){
            return null;
        }
        if(type.equals("ERROR")){
            return new ErrorLogger(ErrFile);
        }
        else if (type.equals("STD")){
            return new StdLogger(StdFile);
        }
        return null;
    }
}
