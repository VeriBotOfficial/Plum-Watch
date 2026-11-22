package android.gov.nist.core;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* loaded from: classes.dex */
public class LogWriter implements StackLogger {
    private String buildTimeStamp;
    private Properties configurationProperties;
    private int lineCount;
    private Logger logger;
    private String stackName;
    private String logFileName = null;
    private volatile boolean needsLogging = false;
    protected int traceLevel = 0;

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i) {
        if (this.needsLogging) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            for (int i2 = 1; i2 < stackTrace.length; i2++) {
                printWriter.print("[" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + "]");
            }
            printWriter.close();
            String stringBuffer = stringWriter.getBuffer().toString();
            Level level = getLevel(i);
            if (level.isGreaterOrEqual(getLogPriority())) {
                this.logger.log(level, stringBuffer);
            }
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return this.lineCount;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public void addAppender(Appender appender) {
        this.logger.addAppender(appender);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th) {
        if (this.needsLogging) {
            getLogger().error(th.getMessage(), th);
        }
    }

    private void countLines(String str) {
        for (char c : str.toCharArray()) {
            if (c == '\n') {
                this.lineCount++;
            }
        }
    }

    private String enhanceMessage(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[3];
        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + Separators.LPAREN + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") [" + str + "]";
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().debug(enhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().debug(enhanceMessage, exc);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        if (this.needsLogging) {
            String enhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(enhanceMessage);
            getLogger().trace(enhanceMessage);
        }
    }

    private void setTraceLevel(int i) {
        this.traceLevel = i;
    }

    public int getTraceLevel() {
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        Logger logger = getLogger();
        String enhanceMessage = enhanceMessage(str);
        countLines(enhanceMessage);
        logger.fatal(enhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        Logger logger = getLogger();
        String enhanceMessage = enhanceMessage(str);
        countLines(enhanceMessage);
        logger.error(enhanceMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: NumberFormatException -> 0x0108, TryCatch #1 {NumberFormatException -> 0x0108, blocks: (B:9:0x0032, B:11:0x0040, B:13:0x0082, B:15:0x008b, B:16:0x00b2, B:18:0x00b6, B:20:0x00ba, B:23:0x00c9, B:26:0x0102, B:39:0x00d9, B:31:0x00dd, B:33:0x00ee, B:37:0x00fd, B:43:0x0095, B:45:0x009f, B:47:0x00a9, B:48:0x0047, B:51:0x0050, B:54:0x005a, B:57:0x0064, B:59:0x006c, B:62:0x0075, B:64:0x007b), top: B:8:0x0032, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // android.gov.nist.core.StackLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackProperties(java.util.Properties r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.gov.nist.core.LogWriter.setStackProperties(java.util.Properties):void");
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.needsLogging;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i) {
        return this.needsLogging && i <= this.traceLevel;
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

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
        this.needsLogging = false;
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
        this.needsLogging = true;
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.buildTimeStamp = str;
    }

    public Priority getLogPriority() {
        int i = this.traceLevel;
        if (i == 16) {
            return Priority.INFO;
        }
        if (i == 4) {
            return Priority.ERROR;
        }
        if (i == 32) {
            return Priority.DEBUG;
        }
        if (i == 64) {
            return Priority.DEBUG;
        }
        return Priority.FATAL;
    }

    public Level getLevel(int i) {
        if (i == 16) {
            return Level.INFO;
        }
        if (i == 4) {
            return Level.ERROR;
        }
        if (i == 32) {
            return Level.DEBUG;
        }
        if (i == 64) {
            return Level.ALL;
        }
        return Level.OFF;
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger.getName();
        }
        return null;
    }
}
