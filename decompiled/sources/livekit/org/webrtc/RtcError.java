package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class RtcError {
    private final RtcException error;

    private RtcError(RtcException error) {
        this.error = error;
    }

    public static RtcError success() {
        return new RtcError(null);
    }

    public static RtcError error(String error) {
        return new RtcError(new RtcException(error));
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    public boolean isError() {
        return this.error != null;
    }

    public RtcException error() {
        return this.error;
    }

    public void throwError() {
        RtcException rtcException = this.error;
        if (rtcException != null) {
            throw rtcException;
        }
    }
}
