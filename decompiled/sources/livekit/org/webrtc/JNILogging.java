package livekit.org.webrtc;

import livekit.org.webrtc.Logging;

/* loaded from: classes8.dex */
class JNILogging {
    private final Loggable loggable;

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }

    public void logToInjectable(String message, Integer severity, String tag) {
        this.loggable.onLogMessage(message, Logging.Severity.values()[severity.intValue()], tag);
    }
}
