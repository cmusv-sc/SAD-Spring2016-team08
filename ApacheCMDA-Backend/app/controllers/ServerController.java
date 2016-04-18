package controllers;

import log.LoggerFactory;
import play.mvc.Controller;
import log.Logger;

/**
 * Created by zhengyiwang on 4/18/16.
 */
public abstract class ServerController extends Controller {
    public static LoggerFactory loggerFactory = new LoggerFactory();

    public static Logger errorLogger  = loggerFactory.getLogger("ERROR");
    public static Logger stdLogger = loggerFactory.getLogger("STD");





    public void log_std(String s ){
        stdLogger.log(s);
    }

    public void log_err(String s){
        errorLogger.log(s);
    }

    public void closelog(){
        errorLogger.closeLog();;
        stdLogger.closeLog();
    }



}
