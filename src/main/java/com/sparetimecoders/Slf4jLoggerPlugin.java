package com.sparetimecoders;
import org.slf4j.LoggerFactory;

/**
 * Slf4jLoggerPlugin uses SLF4J as a backend for JBoss logging.
 */
public class Slf4jLoggerPlugin implements org.jboss.logging.LoggerPlugin {
    private transient org.slf4j.Logger log;


    @Override
    public void init(final String name) {
        log = LoggerFactory.getLogger(name);
    }

    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public void trace(final Object o) {
        log.trace(getSafeString(o));
    }

    @Override
    public void trace(final Object o, final Throwable throwable) {
        log.trace(getSafeString(o), throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public void debug(final Object o) {
        log.debug(getSafeString(o));
    }

    @Override
    public void debug(final Object o, final Throwable throwable) {
        log.debug(getSafeString(o), throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public void info(final Object o) {
        log.info(getSafeString(o));
    }

    @Override
    public void info(final Object o, final Throwable throwable) {
        log.info(getSafeString(o), throwable);
    }

    @Override
    public void error(final Object o) {
        log.error(getSafeString(o));
    }

    @Override
    public void error(final Object o, final Throwable throwable) {
        log.error(getSafeString(o), throwable);
    }

    @Override
    public void warn(final Object o) {
        log.warn(getSafeString(o));
    }

    @Override
    public void warn(final Object o, final Throwable throwable) {
        log.warn(getSafeString(o), throwable);
    }

    @Override
    public void fatal(final Object o) {
        log.error(getSafeString(o));
    }

    @Override
    public void fatal(final Object o, final Throwable throwable) {
        log.error(getSafeString(o), throwable);
    }

    private String getSafeString(final Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof String) {
            return (String) o;
        }
        return o.toString();
    }
}
