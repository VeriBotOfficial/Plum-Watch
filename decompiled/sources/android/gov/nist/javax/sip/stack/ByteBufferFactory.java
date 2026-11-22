package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import com.facebook.react.uimanager.ViewProps;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferFactory {
    private boolean useDirect = true;
    private static StackLogger logger = CommonLogger.getLogger(ByteBufferFactory.class);
    private static ByteBufferFactory instance = new ByteBufferFactory();

    public static ByteBufferFactory getInstance() {
        return instance;
    }

    public ByteBuffer allocateDirect(int i) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Allocating direct buffer " + i);
        }
        return this.useDirect ? ByteBuffer.allocateDirect(i) : ByteBuffer.allocate(i);
    }

    public ByteBuffer allocate(int i) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Allocating buffer " + i);
        }
        return ByteBuffer.allocate(i);
    }

    public void setUseDirect(boolean z) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Direct buffers are ".concat(z ? ViewProps.ENABLED : "disabled"));
        }
        this.useDirect = z;
    }
}
