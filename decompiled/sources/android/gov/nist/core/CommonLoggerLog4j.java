package android.gov.nist.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/* loaded from: classes.dex */
public class CommonLoggerLog4j implements StackLogger {
    private Logger logger;

    private void setTraceLevel(int i) {
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return 0;
    }

    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        for (int i2 = 1; i2 < stackTrace.length; i2++) {
            printWriter.print("[" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + "]");
        }
        printWriter.close();
        this.logger.debug(stringWriter.getBuffer().toString());
    }

    public Logger getLogger() {
        return this.logger;
    }

    public void addAppender(Appender appender) {
        this.logger.addAppender(appender);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th) {
        this.logger.error("Error", th);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        this.logger.debug(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        this.logger.debug(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        this.logger.debug(str);
    }

    public int getTraceLevel() {
        return levelToInt(this.logger.getLevel());
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        this.logger.fatal(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        this.logger.error(str);
    }

    public CommonLoggerLog4j(Logger logger) {
        this.logger = logger;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i) {
        return this.logger.isEnabledFor(intToLevel(i));
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().error(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().warn(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        getLogger().info(str);
    }

    public static Level intToLevel(int i) {
        if (i == 2) {
            return Level.FATAL;
        }
        if (i == 4) {
            return Level.ERROR;
        }
        if (i == 8) {
            return Level.WARN;
        }
        if (i == 16) {
            return Level.INFO;
        }
        if (i == 32) {
            return Level.DEBUG;
        }
        if (i == 64) {
            return Level.TRACE;
        }
        return Level.OFF;
    }

    public static int levelToInt(Level level) {
        if (level.equals(Level.INFO)) {
            return 16;
        }
        if (level.equals(Level.ERROR)) {
            return 4;
        }
        if (level.equals(Level.DEBUG)) {
            return 32;
        }
        if (level.equals(Level.WARN)) {
            return 8;
        }
        if (level.equals(Level.TRACE)) {
            return 64;
        }
        return level.equals(Level.FATAL) ? 2 : 0;
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger.getName();
        }
        return null;
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.logger.info("Build timestamp: " + str);
    }
}
