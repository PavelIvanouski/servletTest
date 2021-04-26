package by.pvt.listener;

import by.pvt.filter.LoggingFilter;
import org.apache.log4j.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.sql.Array;
import java.util.concurrent.atomic.AtomicInteger;


public class SessionCounter implements HttpSessionListener {

    private AtomicInteger counter = new AtomicInteger(0);
    static final private Logger LOGGER = Logger.getLogger(SessionCounter.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOGGER.info("Current active users =" + counter.incrementAndGet());
        int[] myArray = new int[10];
        for (int ints:myArray) {

        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        counter.decrementAndGet();
    }
}
