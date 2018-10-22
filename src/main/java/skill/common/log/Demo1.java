package skill.common.log;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/*
 * http://www.vogella.com/tutorials/Logging/article.html
 * Java Logging API - Tutorial
 * */
public class Demo1 {
    // assumes the current class is called Demo1
    private final static Logger LOGGER = Logger.getLogger(Demo1.class.getName());

    public static void main(String[] args) {

    }

    private static void test1() {
        LOGGER.setLevel(Level.INFO);
    }

    private static void test2() {
        LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.FINE);
    }
}
